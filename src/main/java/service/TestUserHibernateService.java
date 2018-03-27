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

    TestUserDAO testUserDAO;

    @Autowired
    public void setTestUserDAO(TestUserDAO testUserDAO) {
        this.testUserDAO = testUserDAO;
    }


    @Transactional
    public void saveAndUpdate(TestUser testUser){


        testUserDAO.persist(testUser);

    }

    @Transactional
    public List<TestUser> findAll() {
        return testUserDAO.getAll();
    }

}
