package BIO;

public class mainClass {
    public static void main(String[] args) {
        try{
            MyServer server = new MyServer(7777);
            server.start();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
