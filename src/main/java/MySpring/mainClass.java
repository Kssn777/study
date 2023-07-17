package MySpring;

import MySpring.MyApplicationContext;

/**
 * @author lrh
 * @description
 * @date 2022/8/10
 */
public class mainClass {
    public static void main(String[] args) {
        MyApplicationContext context = new MyApplicationContext(MyConfig.class);
        MyConfig config = context.getBean("myConfig",MyConfig.class);
        System.out.println(config);
    }
}
