package com.okooo.osgi.test1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloServiceImpl implements IHelloService {
	private final Log logger = LogFactory.getLog(HelloServiceImpl.class);

	@Override
	public void hello() {
		logger.info("hhhh");
	}

}
