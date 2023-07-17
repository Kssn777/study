package aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class MyAspect {

    @Pointcut("@annotation(aop.Mymethod)")
    public void pt(){}

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        System.out.printf("signature = %s\n",signature);
        String methodName = signature.getName();
        System.out.printf("methodName = %s\n",methodName);
        Class[] argsType = new Class[pjp.getArgs().length];
        Object[] args = pjp.getArgs();
        for(int i=0;i<args.length;i++){
            if(args[i] != null){
                argsType[i] = args[i].getClass();
            }else{
                argsType[i] = null;
            }
        }
        Method method = pjp.getSignature().getDeclaringType().getMethod(methodName, argsType);
        Mymethod annotation = method.getAnnotation(Mymethod.class);
        String name = annotation.value();
        Object proceed = pjp.proceed();
        System.out.println("代理了。。。");
        return proceed;

    }
}
