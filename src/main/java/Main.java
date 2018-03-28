import models.main.Tag;
import models.main.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TagService;
import service.UserService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

       

       /* User user = new User();
        user.setLastName("last");
        user.setName("Name");
        user.setPassword("boo");
        user.setLogin("poof");

        UserService userService = context.getBean(UserService.class);

        userService.saveOrUpdate(user);

        System.out.println(userService.getById(1L).toString());*/
    }


}
