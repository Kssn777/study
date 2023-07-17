package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MapperUtils {
    public static <T> T getMapper(Class<T> mapper) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory session = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = session.openSession();
        return sqlSession.getMapper(mapper);
    }
}
