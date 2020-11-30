import cn.wys.pojo.Books;
import cn.wys.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
   @Test
    public void test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       BookService bookServiceImpl = (BookService) context.getBean("bookService");
       for (Books books : bookServiceImpl.queryAllBook()) {
           System.out.println(books);
       }
   }
}
