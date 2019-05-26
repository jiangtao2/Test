package com.demo.aop.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
@Aspect
public class TestAspect {

    protected static Logger logger = LoggerFactory.getLogger(TestAspect.class);

    @Pointcut(value = "execution(* com.demo.aop.controller.TestController.*(..))")
    //@Pointcut(value = "execution(public String test(..))")
    public void curOffPoint() {
    }

   // @AfterThrowing(value="curOffPoint()",throwing = "exception")
    @Before("curOffPoint()")
    public void beforeTest(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        for (Object msg:
             args) {
            logger.info("执行了"+joinPoint.getSignature().getName()+"()方法"+"参数值为："+msg);
        }
    }
}
