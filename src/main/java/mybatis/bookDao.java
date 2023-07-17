package mybatis;

import java.io.IOException;
import java.util.List;

public interface bookDao {
    List<Book> getAll();

    List<Book> getBooksById(Integer id);

    List<Book> getBooksByIds(Integer... ids);
}
