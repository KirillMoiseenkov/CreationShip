package DAO.implement;


import DAO.DAOInterfaces.IDAOEntity;
import models.main.TestUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class TestUserDAO implements IDAOEntity<TestUser>{

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public TestUser getByID() {
        return null;
    }

    public void persist(TestUser testUser){
        entityManager.persist(testUser);
        }


    @Override
    //@Transactional
    public List<TestUser> getAll() {
        return entityManager.createQuery("SELECT p FROM TestUser p").getResultList();
    }
}
