package spring.aop.logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    @Before("execution(public void spring.aop.service.UserService.logIn())")
    public void loggingAdvice(){
        System.out.println("before method execution");
    }

    @After("execution(public void spring.aop.service.UserService.logIn())")
    public void loggingAdvice2(){
        System.out.println("After method execution");
    }
}
