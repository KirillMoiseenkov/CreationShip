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

        testUserDAO.saveOrUpdate(testUser);
    }

    @Transactional
    public void remove(TestUser testUser)
    {
        testUserDAO.remove(testUser);

    }

    @Transactional
    public void removeByID(Long id)
    {
        testUserDAO.removeById(id);

    }

    @Transactional
    public TestUser getById(Long id){
       return testUserDAO.getByID(id);
    }

    @Transactional
    public List<TestUser> findAll() {
        return testUserDAO.getAll();
    }

}
