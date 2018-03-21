import models.main.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        String path = "mainSpringConf.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);

        User user = (User) context.getBean("user");
        System.out.println(user.getId());

    }


}
