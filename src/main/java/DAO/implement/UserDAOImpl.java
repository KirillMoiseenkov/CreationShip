package DAO.implement;

import DAO.DAOInterfaces.IUserDAO;
import models.main.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements IUserDAO {

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
        return entityManager.createQuery
                ("SELECT p FROM User p WHERE p.lastName = :name and p.name = : name")
                .setParameter("name",name)
                .setParameter("lastName",lastName)
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
        return entityManager.createQuery("SELECT p FROM User p WHERE p.login = :login " +
                "and p.password = : password")
                .setParameter("",login)
                .setParameter("",password)
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
        return  entityManager.createQuery("SELECT p FROM User p").getResultList();
    }
}
