package com.okooo.osgi.ecl;

import java.util.Set;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
/**
 * 
 * @author jiangyubao@gmail.com
 * 
 */
public class CommandUtil {
	private static BundleContext context;
	private static CommandInterpreter ci;

	public static void performAction(String actionName, Set<Long> idSet) {
		if (actionName.equals("start")) {
			start(idSet);
		} else if (actionName.equals("stop")) {
			stop(idSet);
		} else if (actionName.equals("restart")) {
			restart(idSet);
		} else if (actionName.equals("update")) {
			update(idSet);
		}
	}

	public static void setBundleContext(BundleContext ctx) {
		context = ctx;
	}

	public static void setCommandInterpreter(
			CommandInterpreter commandInterpreter) {
		ci = commandInterpreter;
	}

	public static void start(Set<Long> idSet) {
		for (Long id : idSet) {
			try {
				ci.println("trying to start " + id + "...");
				Bundle bundle = context.getBundle(id);
				if (bundle != null) {
					bundle.start();
				}
			} catch (BundleException e) {
				ci.printStackTrace(e);
			}
		}
	}

	public static void stop(Set<Long> idSet) {
		for (Long id : idSet) {
			try {
				ci.println("trying to stop " + id + "...");
				Bundle bundle = context.getBundle(id);
				if (bundle != null) {
					bundle.stop();
				}
			} catch (BundleException e) {
				ci.printStackTrace(e);
			}
		}
	}

	public static void update(Set<Long> idSet) {
		for (Long id : idSet) {
			try {
				ci.println("trying to stop " + id + "...");
				Bundle bundle = context.getBundle(id);
				if (bundle != null) {
					bundle.update();
				}
			} catch (BundleException e) {
				ci.printStackTrace(e);
			}
		}
	}

	public static void uninstall(Set<Long> idSet) {
		for (Long id : idSet) {
			try {
				ci.println("trying to uninstall " + id + "...");
				Bundle bundle = context.getBundle(id);
				if (bundle != null) {
					bundle.uninstall();
				}
			} catch (BundleException e) {
				ci.printStackTrace(e);
			}
		}
	}

	public static void install(Set<String> jarSet) {
		ci.println("not implement");
	}

	public static void restart(Set<Long> idSet) {
		for (Long id : idSet) {
			try {
				ci.println("trying to restart " + id + "...");
				Bundle bundle = context.getBundle(id);
				if (bundle != null) {
					bundle.stop();
					bundle.update();
					bundle.start();
				}
			} catch (BundleException e) {
				ci.printStackTrace(e);
			}
		}
	}
}
