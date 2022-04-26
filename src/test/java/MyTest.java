import com.dsq.pojo.Books;
import com.dsq.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author daishq
 * @date: 2022/4/26 14:56
 * @description:
 */
public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books: bookServiceImpl.queryAllBook()){
            System.out.println(books);
        }
    }
}
