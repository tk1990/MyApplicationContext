import com.my.proj.MyApp;
import com.my.proj.MyApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Created by IntelliJ IDEA.
 * @Author: tk
 * @Date: 2018/6/13
 * @Time: 上午9:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class MyAppTest {

    @Test
    public void sayHelloTest() {
        MyApp myApp = (MyApp) MyApplicationContext.getBean("myApp");
        myApp.sayHello();;
    }
}
