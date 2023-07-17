package MySpring;



/**
 * @author lrh
 * @description
 * @date 2022/8/10
 */
@MyConfiguration
public class MyConfig {

    @MyBean(name = "person")
    public Person getPerson(){
        return new Person();
    }
}
