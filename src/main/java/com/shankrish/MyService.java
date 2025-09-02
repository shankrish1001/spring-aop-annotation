package com.shankrish;

import java.util.logging.Logger;

public class MyService {
	private static final Logger logger = Logger.getLogger(MyService.class.getName());
    public void doSomething() {
        logger.info("Executing doSomething() method");
    }
}
