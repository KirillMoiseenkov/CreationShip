import models.main.TestUser;
import models.main.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestUserService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

//    @Autowired
//    public  static SessionFactory sessionFactory;

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory  =
                Persistence.createEntityManagerFactory( "main" );

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        TestUser user = new TestUser();
      //  entityManager.persist(user);


        user.setAge(115);
       // user.setId(14);
        user.setFirstname("i love you new record11 yes");
        user.setLastname("Allah");

//       entityManager.merge(user);

        entityManager.getTransaction().begin();

        entityManager.persist(user);


        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        /*ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

        TestUserService testUserService  = (TestUserService) context.getBean("TestUserService");

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
