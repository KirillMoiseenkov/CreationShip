import models.main.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class Main {

    public static void main(String[] args)  {

        ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

        UserService userService = context.getBean(UserService.class);


        System.out.println(userService.getById(1L).toString());


    }


}
