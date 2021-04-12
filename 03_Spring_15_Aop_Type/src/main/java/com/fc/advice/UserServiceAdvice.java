package com.fc.advice;

import org.aspectj.lang.ProceedingJoinPoint;


public class UserServiceAdvice {


    //前置通知，在方法执行前执行
    public void before(){
        System.out.println("before:前置通知，在方法执行前执行");
    }

    //后置通知，出现异常不执行
    public void afterReturning(){
        System.out.println("afterReturning:后置通知，出现异常不执行");
    }

    //后置异常通知，出现异常会执行
    public void afterThrowing(){
        System.out.println("afterThrowing:后置异常通知，出现异常会执行");
    }

    //后置通知，也叫最终通知，无论是否异常都会执行
    public void after(){
        System.out.println("after:后置通知，也叫最终通知，无论是否出现异常都会执行");
    }

    //环绕通知
    //joinPoint：连接点，就是被代理对象的所有方法
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("around:环绕通知，在目标方法前执行");

        //执行目标方法
        Object result=null;


        try {
            result=joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("around:环绕通知，在目标方法执行后执行");

        return result;
    }

}
