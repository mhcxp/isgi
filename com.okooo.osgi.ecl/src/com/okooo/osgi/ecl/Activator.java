package com.okooo.osgi.ecl;

import java.io.FileInputStream;
import java.util.Hashtable;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

/**
 * 
 * @author jiangyubao@gmail.com
 * 
 */
public class Activator implements BundleActivator, CommandProvider {

	private BundleContext context;
	private String scriptDir = "data/ecl/";

	private final static String SCRIPT_DIR = "com.okooo.osgi.ecl.script.dir";

	public void start(BundleContext context) throws Exception {
		this.context = context;
		String scriptDirParam = this.context.getProperty(SCRIPT_DIR);
		if (scriptDirParam != null) {
			this.scriptDir = scriptDirParam;
		}
		CommandUtil.setBundleContext(context);
		context.registerService(CommandProvider.class.getName(), this,
				new Hashtable());
	}

	public void stop(BundleContext context) throws Exception {
	}

	public String getHelp() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\tbstart (bid(,bid)* | bid..bid)\n");
		buffer.append("\tbupdate (bid(,bid)* | bid..bid)\n");
		buffer.append("\tbrestart (bid(,bid)* | bid..bid)\n");
		buffer.append("\tbstop (bid(,bid)* | bid..bid)\n");
		buffer.append("\tecl scriptName\n");
		return buffer.toString();
	}

	public void _bstart(final CommandInterpreter ci) throws Exception {
		this.bundleProcessor(ci.nextArgument(), new IAction() {
			@Override
			public void performAction(Bundle bundle) {
				try {
					bundle.start();
				} catch (BundleException e) {
					ci.printStackTrace(e);
				}
			}
		});
	}

	public void _bupdate(final CommandInterpreter ci) throws Exception {
		this.bundleProcessor(ci.nextArgument(), new IAction() {
			@Override
			public void performAction(Bundle bundle) {
				try {
					bundle.update();
				} catch (BundleException e) {
					ci.printStackTrace(e);
				}
			}
		});
	}

	public void _brestart(final CommandInterpreter ci) throws Exception {
		this.bundleProcessor(ci.nextArgument(), new IAction() {
			@Override
			public void performAction(Bundle bundle) {
				try {
					bundle.stop();
					bundle.update();
					bundle.start();
				} catch (BundleException e) {
					ci.printStackTrace(e);
				}
			}
		});
	}

	private void bundleProcessor(String args, IAction action) {
		args = args.trim();
		if (args.indexOf("..") != -1) {
			String[] bundleIdRange = args.split("\\.\\.");
			Long start = Long.parseLong(bundleIdRange[0]);
			Long end = Long.parseLong(bundleIdRange[1]);
			if (end < start) {
				Long temp = end;
				end = start;
				start = temp;
			}
			for (long bundleId = start; bundleId <= end; bundleId++) {
				Bundle bundle = context.getBundle(bundleId);
				action.performAction(bundle);
			}
		} else {
			String[] bundleIds = args.split(",");
			for (String bundleId : bundleIds) {
				Bundle bundle = context.getBundle(Long.parseLong(bundleId));
				action.performAction(bundle);
			}
		}
	}

	private interface IAction {
		public void performAction(Bundle bundle);
	}

	public void _bstop(final CommandInterpreter ci) throws Exception {
		this.bundleProcessor(ci.nextArgument(), new IAction() {
			@Override
			public void performAction(Bundle bundle) {
				try {
					bundle.stop();
				} catch (BundleException e) {
					ci.printStackTrace(e);
				}
			}
		});
	}

	public void _ecl(final CommandInterpreter ci) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				scriptDir + ci.nextArgument()));
		CommandUtil.setCommandInterpreter(ci);
		ECLLexer lexer = new ECLLexer();
		lexer.setCharStream(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ECLParser parser = new ECLParser(tokens);
		parser.prog();
	}
}
