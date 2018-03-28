import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        /*   *//*   EntityManagerFactory entityManagerFactory  =
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
     *//*


        TestUser user = new TestUser();



        user.setAge(125);
        user.setFirstname("i love you new record11 yes");
        user.setLastname("Allah");
        ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

        TestUserHibernateService testUserHibernateService =
                (TestUserHibernateService) context.getBean("testUserHibernateService");

        testUserHibernateService.saveAndUpdate(user);

        System.out.println(testUserHibernateService.findAll().size());



//        System.out.println( testUserHibernateService.getTestUser());

//        TestUserDAO testUserDAO = (TestUserDAO) context.getBean("testUserDAO");




        *//*if(testUserDAO.entityManager == null)
           System.out.println("null");
        else {
            List<TestUser> userList = testUserDAO.entityManager.createQuery("SELECT  p FROM TestUser p").getResultList();
            System.out.println(userList.size());
        }*//*
         *//* TestUserService testUserService  = (TestUserService) context.getBean("TestUserService");

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
