package DAO.implement;

import DAO.DAOInterfaces.IUserDAO;
import models.main.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements IUserDAO {

    private static final Logger log = Logger.getLogger(UserDAOImpl.class);


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List getByName(String name) {
        return entityManager.createQuery
                ("SELECT p FROM User p WHERE p.name = :name").setParameter("name",name).getResultList();

    }

    @Override
    public List getByLastName(String lastName) {
        return entityManager.createQuery
                ("SELECT p FROM User p WHERE p.lastName = :name").setParameter("name",lastName).getResultList();

    }

    @Override
    public List getByNameLastNameCombination(String name, String lastName) {
        return entityManager.
                createNativeQuery("SELECT * FROM User WHERE name =  ? and lastName = ?",User.class)
                .setParameter(1,name)
                .setParameter(2,lastName)
                .getResultList();

    }

    @Override
    public List getByPassword(String password) {
        return null;
    }

    @Override
    public List getByLogin(String login) {
        return entityManager.createQuery("SELECT p FROM User p WHERE p.login = :login")
                .setParameter("login",login)
                .getResultList();
    }

    @Override
    public List getByPasswordLoginCombination(String login, String password) {
        return entityManager.
                createNativeQuery("SELECT * FROM User WHERE login =  ? and password = ?",User.class)
                .setParameter(1,login)
                .setParameter(2,password)
                .getResultList();
    }

    @Override
    public void saveOrUpdate(User user) {
        entityManager.persist(user);
    }

    @Override
    public void remove(User user) {
        entityManager.remove(user);
    }

    @Override
    public void removeById(Long id) {
        User temporary = entityManager.find(User.class, id);
        entityManager.remove(temporary);
    }

    @Override
    public User getByID(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> getAll() {

        List<User> users = entityManager.createQuery("SELECT p FROM User p").getResultList();

        if(users == null)
            log.warn("get all users return null");

        log.trace("try to get all element users");

        return users;
    }
}
