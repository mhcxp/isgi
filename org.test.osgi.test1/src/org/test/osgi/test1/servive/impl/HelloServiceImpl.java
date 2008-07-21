package org.test.osgi.test1.servive.impl;

import org.test.osgi.test1.servive.IHelloService;

public class HelloServiceImpl implements IHelloService {
	private String who;

	@Override
	public void hello() {
		System.out.println("say hello to " + who);
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

}
