import org.jetbrains.annotations.TestOnly;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @TestOnly
    public BeanTest() {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Bean bean=applicationContext.getBean("bean",Bean.class);
        System.out.println("bean = "+bean);

    }
}
