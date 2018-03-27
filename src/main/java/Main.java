import DAO.implement.TestUserDAO;
import models.main.TestUser;
import models.main.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestUserHibernateService;
import service.TestUserService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

//    @Autowired
//    public  static SessionFactory sessionFactory;

    public static void main(String[] args) {


     /*   EntityManagerFactory entityManagerFactory  =
                Persistence.createEntityManagerFactory( "main" );

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        TestUser user = new TestUser();



        user.setAge(115);
        user.setFirstname("i love you new record11 yes");
        user.setLastname("Allah");

       List<TestUser> userList  = entityManager.createQuery("SELECT  p FROM TestUser p").getResultList();
        for (TestUser anUserList : userList) System.out.println(anUserList.getAge());
        entityManager.close();
        entityManagerFactory.close();
     */
        ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

//        TestUserHibernateService testUserHibernateService =
//                (TestUserHibernateService) context.getBean("testUserHibernateService");
//        System.out.println( testUserHibernateService.getTestUser());

        TestUserDAO testUserDAO = (TestUserDAO) context.getBean("testUserDAO");

        TestUser user = new TestUser();



        user.setAge(120);
        user.setFirstname("i love you new record11 yes");
        user.setLastname("Allah");


        /*if(testUserDAO.entityManager == null)
           System.out.println("null");
        else {
            List<TestUser> userList = testUserDAO.entityManager.createQuery("SELECT  p FROM TestUser p").getResultList();
            System.out.println(userList.size());
        }*/
        /* TestUserService testUserService  = (TestUserService) context.getBean("TestUserService");

        SessionFactory sessionFactory = testUserService.getConnection();
                //(SessionFactory) context.getBean("sessionFactory");
                //HibernateUtil.getSessionfactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();



        TestUser user = new TestUser();

        user.setAge(1);
        user.setId(12);
        user.setFirstname("i love you Spring for Now last check");
        user.setLastname("Allah");


        session.save(user);
        session.getTransaction().commit();

        session.close();

        sessionFactory.close();*/
    }


}
