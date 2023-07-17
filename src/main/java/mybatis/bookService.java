package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class bookService implements bookDao  {
    private bookDao mapper = null;
    {
        try {
            mapper = MapperUtils.getMapper(bookDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getAll() {
        return mapper.getAll();
    }

    @Override
    public List<Book> getBooksById(Integer id) {
        return mapper.getBooksById(id);
    }

    @Override
    public List<Book> getBooksByIds(Integer... ids) {
        return mapper.getBooksByIds(ids);
    }
}
