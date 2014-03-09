package ua.hneu.student.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    /*@Before("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
     public void logBefore(JoinPoint joinPoint) {

     System.out.println("logBefore() is running!");
     System.out.println("hijacked : " + joinPoint.getSignature().getName());
     System.out.println("******");
     }*/

    /*@After("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
     public void logAfter(JoinPoint joinPoint) {

     System.out.println("logAfter() is running!");
     System.out.println("hijacked : " + joinPoint.getSignature().getName());
     System.out.println("******");

     }*/
    /*@AfterReturning(
     pointcut = "execution(* com.mkyong.customer.bo.CustomerBo.addCustomerReturnValue(..))",
     returning= "result")
     public void logAfterReturning(JoinPoint joinPoint, Object result) {

     System.out.println("logAfterReturning() is running!");
     System.out.println("hijacked : " + joinPoint.getSignature().getName());
     System.out.println("Method returned value is : " + result);
     System.out.println("******");

     }*/
    /*@AfterThrowing(
     pointcut = "execution(* com.mkyong.customer.bo.CustomerBo.addCustomerThrowException(..))",
     throwing= "error")
     public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

     System.out.println("logAfterThrowing() is running!");
     System.out.println("hijacked : " + joinPoint.getSignature().getName());
     System.out.println("Exception : " + error);
     System.out.println("******");

     }*/
    @Around("execution(* ua.hneu.student.domain.Group.setGroupId(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("logAround() is running!");
        System.out.println("Method : " + joinPoint.getSignature().getName() + " is launched");
        System.out.println("Arguments : " + Arrays.toString(joinPoint.getArgs()));

        System.out.println("Transaction started");
        joinPoint.proceed();
        System.out.println("Transaction completed");

        System.out.println("******");
    }
    
   @AfterThrowing(
     pointcut = "execution(* ua.hneu.student.domain.Group.setGroupId(..))",
     throwing= "error")
     public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

     System.out.println("logAfterThrowing() is running!");
     System.out.println("hijacked : " + joinPoint.getSignature().getName());
     System.out.println("Exception : " + error);
     System.out.println("******");

     }
}
