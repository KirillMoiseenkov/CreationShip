package service;


import DAO.implement.TestUserDAO;
import models.main.TestUser;
import models.main.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class TestUserHibernateService {

/*
    TestUserDAO testUserDAO;

    @Autowired
    public void setTestUserDAO(TestUserDAO testUserDAO) {
        this.testUserDAO = testUserDAO;
    }

*/
   private User testUser;

    @Autowired
    public void setTestUser(User testUser) {
        this.testUser = testUser;
    }

    public User getTestUser() {
        return testUser;
    }

    @Transactional
    public List<TestUser> findAll() {
        return null;//testUserDAO.getAll();
    }

}
