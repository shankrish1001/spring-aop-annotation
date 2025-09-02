package com.shankrish;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
	private static final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Before("execution(* com.shankrish.MyService.doSomething(..))")
    public void logBefore() {
        logger.info("Before executing doSomething() 11 1111");
    }

    @After("execution(* com.shankrish.MyService.doSomething(..))")
    public void logAfter() {
        logger.info("After executing doSomething() 22 2222");
    }

}