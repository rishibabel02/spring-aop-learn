package spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "spring.aop")
@EnableAspectJAutoProxy
    public class App{

        public static void main(String[] args){
            SpringApplication.run(App.class, args);
        }
}