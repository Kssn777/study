package Singleton;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t6 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t7 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t8 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t9 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });

        Thread t10 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(SingletonFactory.getInstance());
            }
        });


        t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();t7.start();
        t8.start();t9.start();t10.start();
    }

}
