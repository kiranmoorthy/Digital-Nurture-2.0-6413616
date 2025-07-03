package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.*(..))")
    public void logBefore(){
        System.out.println("[LOG] Method execution starting ...");
    }

    @After("execution(* com.library.service.BookService.*(..))")
    public void logAfter(){
        System.out.println("[LOG] Method execution completed ...");
    }
}
