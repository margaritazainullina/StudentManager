package ua.hneu.student.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import org.apache.log4j.*;

@Aspect
public class LoggingAspect {

    static final Logger logger = Logger.getLogger(LoggingAspect.class);

    //launching setters
    @After("execution(* ua.hneu.student.domain.Group.setGroupId(..))")
    public void logGroupId(JoinPoint joinPoint) {
        logger.info("Method : " + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")" + " is launched");
        logger.info("Inserting value GroupId =\"" + joinPoint.getArgs() + "\" to database");
    }

    @After("execution(* ua.hneu.student.domain.Speciality.setSpecialityId(..))")
    public void logSpecialityId(JoinPoint joinPoint) {
        logger.info("Method : " + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")" + " is launched");
        logger.info("Inserting value SpecialityId =\"" + joinPoint.getArgs() + "\" to database");
    }

    //Launched when inserting null value in foreign key field
    @AfterThrowing(
            pointcut = "execution(* ua.hneu.student.domain.Group.setGroupId(..))",
            throwing = "error")
    public void logAfterThrowingGroupId(JoinPoint joinPoint, Throwable error) {
        logger.error("Method : " + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")" + " is launched");
        logger.error("Exception : " + error);
    }

    @AfterThrowing(
            pointcut = "execution(* ua.hneu.student.domain.Speciality.setSpecialityId(..))",
            throwing = "error")
    public void logAfterThrowingSpecialityId(JoinPoint joinPoint, Throwable error) {
        logger.error("Method : " + joinPoint.getSignature().getName() + "(" + Arrays.toString(joinPoint.getArgs()) + ")" + " is launched");
        logger.error("Exception : " + error);
    }

    //After launching getters
    @AfterReturning(
            pointcut = "execution(* ua.hneu.student.domain.Speciality.getGroups(..))",
            returning = "result")
    public void logAfterReturningGroups(JoinPoint joinPoint, Object result) {
        logger.info("Method : " + joinPoint.getSignature().getName() + "()" + " is launched");
        logger.info("Method getGroups returned value is : " + result);
    }

    @AfterReturning(
            pointcut = "execution(* ua.hneu.student.domain.Group.getStudent(..))",
            returning = "result")
    public void logAfterReturningStudents(JoinPoint joinPoint, Object result) {
        logger.info("Method : " + joinPoint.getSignature().getName() + "()" + " is launched");
        logger.info("Method getGroups returned value is : " + result);
    }

}
