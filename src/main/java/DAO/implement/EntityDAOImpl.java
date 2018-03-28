package DAO.implement;

import DAO.DAOInterfaces.IUserDAO;
import models.main.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@EnableTransactionManagement

public class EntityDAOImpl implements IUserDAO{


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("SELECT usr FROM User usr").getResultList();
    }

    @Override
    public List<User> getByName() {
        return null;
    }

    @Override
    public List<User> getByLastName() {
        return null;
    }

    @Override
    public List<User> getByCombination(String name, String lastName) {
        return null;
    }

    @Override
    public void saveOrUpdate(User user) {

    }

    @Override
    public void remove(User user) {

    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public User getByID(Long id) {
        return null;
    }
}
