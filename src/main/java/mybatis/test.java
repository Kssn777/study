package mybatis;

public class test {
    public static void main(String[] args) {
        bookService bookService = new bookService();
        System.out.println(bookService.getBooksByIds(1,2,3));
    }
}
