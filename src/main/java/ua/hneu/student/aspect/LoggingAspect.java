package ua.hneu.student.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    //launching setters
    @After("execution(* ua.hneu.student.domain.Group.setGroupId(..))")
    public void logAroundGroupId(JoinPoint joinPoint) {
        System.out.println("Method : " + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")" + " is launched");
        System.out.println("Inserting value GroupId =\"" + joinPoint.getArgs() + "\" to database");
    }

    @After("execution(* ua.hneu.student.domain.Speciality.setSpecialityId(..))")
    public void logAroundSpecialityId(JoinPoint joinPoint) {
        System.out.println("Method : " + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")" + " is launched");
        System.out.println("Inserting value SpecialityId =\"" + joinPoint.getArgs() + "\" to database");
    }

    //Launched when inserting null value in foreign key field
    @AfterThrowing(
            pointcut = "execution(* ua.hneu.student.domain.Group.setGroupId(..))",
            throwing = "error")
    public void logAfterThrowingGroupId(JoinPoint joinPoint, Throwable error) {
        System.out.println("Method : " + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")" + " is launched");
        System.out.println("Exception : " + error);
    }

    @AfterThrowing(
            pointcut = "execution(* ua.hneu.student.domain.Speciality.setSpecialityId(..))",
            throwing = "error")
    public void loglogAfterThrowingSpecialityId(JoinPoint joinPoint, Throwable error) {
        System.out.println("Method : " + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")" + " is launched");
        System.out.println("Exception : " + error);
    }

    //After launching getters
    @AfterReturning(
            pointcut = "execution(* ua.hneu.student.domain.Speciality.getGroups(..))",
            returning = "result")
    public void logAfterReturningGroups(JoinPoint joinPoint, Object result) {
        System.out.println("Method : " + joinPoint.getSignature().getName() + "()" + " is launched");
        System.out.println("Method getGroups returned value is : " + result);
    }

    @AfterReturning(
            pointcut = "execution(* ua.hneu.student.domain.Group.getStudent(..))",
            returning = "result")
    public void logAfterReturningStudents(JoinPoint joinPoint, Object result) {
        System.out.println("Method : " + joinPoint.getSignature().getName() + "()" + " is launched");
        System.out.println("Method getGroups returned value is : " + result);
    }

}
