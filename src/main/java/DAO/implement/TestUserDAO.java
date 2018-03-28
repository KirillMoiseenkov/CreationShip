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
    public void remove(TestUser testUser) {
     TestUser temporary = entityManager.merge(testUser);
     entityManager.remove(temporary);
    }

    @Override
    public void removeById(Long id) {
        TestUser temporary = entityManager.find(TestUser.class, id);
        entityManager.remove(temporary);

    }


    @Override
    public TestUser getByID(Long id) {
        return entityManager.find(TestUser.class, id);
    }

    public void saveOrUpdate(TestUser testUser){
        entityManager.persist(testUser);
        }


    @Override
    public List<TestUser> getAll() {
        return entityManager.createQuery("SELECT p FROM TestUser p").getResultList();
    }
}
