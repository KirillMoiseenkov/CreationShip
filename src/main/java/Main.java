import models.main.TestUser;
import models.main.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestUserService;

public class Main {

//    @Autowired
//    public  static SessionFactory sessionFactory;

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

        TestUserService testUserService  = (TestUserService) context.getBean("TestUserService");

        SessionFactory sessionFactory = testUserService.getConnection();
                //(SessionFactory) context.getBean("sessionFactory");
                //HibernateUtil.getSessionfactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();



        TestUser user = new TestUser();

        user.setAge(1);
        user.setId(12);
        user.setFirstname("i love you Spring for Now");
        user.setLastname("Allah");


        session.save(user);
        session.getTransaction().commit();

        session.close();

        sessionFactory.close();
    }


}
