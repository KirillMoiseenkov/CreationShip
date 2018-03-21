import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        String path = "mainSpringConf.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);




    }


}
