import DAO.implement.EntityDAOImpl.EntityDAOImpl;
import models.main.User;
import models.main.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserInfoService;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

        UserInfoService userInfoService = context.getBean(UserInfoService.class);

        UserInfo userInfo = new UserInfo();

        User user = new User();

        /*user.setPassword("kirill123");
        user.setName("kirill");
        user.setLastName("moiseenkov");
        */user.setId(1L);

      /*  userInfo.setName("Kirill");
        userInfo.setLastName("Moiseenkov");
        userInfo.setUser(user);
        userInfoService.saveOrUpdate(userInfo);
*/
        System.out.println(userInfoService.getById(1L).toString());


    }


}
