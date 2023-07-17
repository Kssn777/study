package Observer;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        Observer observer = msg -> System.out.println(msg);
        Subject subject = new Subject();
        subject.addObserver(observer);

    }
}
