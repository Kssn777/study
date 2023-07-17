package aop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class AOPTest {

    @Mymethod
    public void a(){
        System.out.println("aaaa");
    }


    public void b(){
        a();
    }





}
