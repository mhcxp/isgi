package org.test.osgi.test2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.test.osgi.test1.servive.IHelloService;

public class Activator implements BundleActivator {

	private ServiceTracker helloServiceTracker;
	private IHelloService service = null;

	public void start(BundleContext context) throws Exception {
		helloServiceTracker = new ServiceTracker(context, IHelloService.class
				.getName(), null);
		helloServiceTracker.open();
		service = (IHelloService) helloServiceTracker.getService();
		service.hello();
	}

	public void stop(BundleContext context) throws Exception {
		helloServiceTracker.close();
		helloServiceTracker = null;
		service = null;
	}
}
