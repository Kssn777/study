package spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author lrh
 * @description
 * @date 2022/8/26
 */
@Aspect
@Component
public class AspectConfig {

    @Pointcut("@annotation(spring.Mymethod)")
    public void pt(){}

    @Around("pt()")
    public void before(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();

        System.out.println("hehe");
    }

}
