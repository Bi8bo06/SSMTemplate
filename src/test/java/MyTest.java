import com.dsq.dao.StudentMapper;
import com.dsq.pojo.Books;
import com.dsq.pojo.Student;
import com.dsq.service.BookService;
import com.dsq.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * @author daishq
 * @date: 2022/4/26 14:56
 * @description:
 */
public class MyTest {
    static Logger logger = Logger.getLogger(MyTest.class);

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }

    @Test
    //一对一关联查询
    public void OneToOneRelatedQuery() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService) context.getBean("StudentServiceImpl");
        System.out.println(studentServiceImpl.queryStuById(2));
    }

    @Test
    //一对一关联查询
    public void OneToManyRelatedQuery() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService) context.getBean("StudentServiceImpl");
        System.out.println(studentServiceImpl.queryTeaById(1));
    }




    @Test
    public void getBookByLimit() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        for (Books books : bookServiceImpl.queryBookByLimit(map)) {
            System.out.println(books);
        }
    }

    @Test
    public void testLog4j() {
        logger.info("info:进入的testLog4j");
        logger.debug("debug:进入的testLog4j");
        logger.error("error:进入的testLog4j");
    }
}
