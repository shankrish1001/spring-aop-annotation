package com.shankrish;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.shankrish.MyService.doSomething(..))")
    public void logBefore() {
        System.out.println("Before executing doSomething() 1111");
    }

    @After("execution(* com.shankrish.MyService.doSomething(..))")
    public void logAfter() {
        System.out.println("After executing doSomething() 2222");
    }

}