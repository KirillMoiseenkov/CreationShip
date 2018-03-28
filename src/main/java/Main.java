import DAO.implement.TestUserDAO;
import models.main.Tag;
import models.main.TestUser;
import models.main.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TagService;
import service.TestUserHibernateService;
import service.TestUserService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("mainSpringConf.xml");

        TagService tagService = (TagService) context.getBean(TagService.class);

        Tag tag = new Tag();
        tag.setName("First");
      //  tag.setId(1);

        //tagService.saveOrUpdate(tag);
        //tagService.findAll().forEach(tagService::remove);
        System.out.println(tagService.findByName("First").toString());
        //tagService.findAll().forEach(i -> System.out.println(i.toString()));

    }


}
