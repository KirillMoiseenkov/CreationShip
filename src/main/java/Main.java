import DAO.implement.EntityDAOImpl.EntityDAOImpl;
import models.main.User;
import models.main.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserInfoService;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");



    }


}
