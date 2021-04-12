package com.fc.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.Test;

//表名一个切面
//@Aspect：表名这是一个切面
@Aspect
public class UserServiceAspect {

    //切点
    @Pointcut("execution(* com.fc.service.impl.UserServiceImpl.*(..))")
    public static void pointcut(){ }

    // 前置通知
    @Before("pointcut()")
    public void before() {
        System.out.println("前置通知");
    }

    // 后置通知
    @After("pointcut()")
    public void after() {
        System.out.println("后置通知");
    }

    // 环绕通知
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("环绕通知，目标方法执行前");

        Object proceed = null;

        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("环绕通知，目标方法执行后");

        return proceed;
    }
     @AfterThrowing("pointcut()")
     public void afterThrowing(){
            System.out.println("后置异常通知");
    }
     @AfterReturning("pointcut()")
     public void afterReturning(){
            System.out.println("后置不发生异常通知");
    }


}
