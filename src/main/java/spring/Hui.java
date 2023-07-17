package spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lrh
 * @description
 * @date 2022/8/11
 */

@Component
public class Hui {
    private int age;

    @Autowired
    private Person person;

    @Mymethod
    public void test(){
        System.out.println("bbb");
    }


}
