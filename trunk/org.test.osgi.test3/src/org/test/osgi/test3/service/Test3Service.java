package org.test.osgi.test3.service;

import org.test.osgi.test1.servive.IHelloService;

public class Test3Service {
	private IHelloService helloService;

	public void init() {
		helloService.hello();
	}

	public IHelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}

}
