package spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lrh
 * @description
 * @date 2022/8/9
 */

@Component
public class Person {
    private String name;

    @Autowired
    private Hui hui;

    @Mymethod
    public void test(){
        System.out.println("aaa");
    }

}
