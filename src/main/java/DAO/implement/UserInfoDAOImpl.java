package DAO.implement;

import DAO.DAOInterfaces.IDAOEntity;
import DAO.DAOInterfaces.IUserInfoDAO;
import models.main.UserInfo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserInfoDAOImpl implements IUserInfoDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List getByName(String name) {
        return entityManager.createQuery
                ("SELECT p FROM user_info p WHERE p.name = :name").setParameter("name",name).getResultList();

    }

    @Override
    public List getByLastName(String lastName) {
        return entityManager.createQuery
                ("SELECT p FROM user_info p WHERE p.lastName = :name").setParameter("name",lastName).getResultList();

    }

    @Override
    public List getByCombination(String name, String lastName) {
        return entityManager.createQuery
                ("SELECT p FROM user_info p WHERE p.lastName = :name and p.name = : name")
                .setParameter("name",name)
                .setParameter("lastName",lastName)
                .getResultList();

    }
    @Override
    public void saveOrUpdate(UserInfo user) {
        entityManager.persist(user);
    }

    @Override
    public void remove(UserInfo user) {
        entityManager.remove(user);
    }

    @Override
    public void removeById(Long id) {
        UserInfo temporary = entityManager.find(UserInfo.class, id);
        entityManager.remove(temporary);
    }

    @Override
    public UserInfo getByID(Long id) {
        return entityManager.find(UserInfo.class, id);
    }

    @Override
    public List<UserInfo> getAll() {
        return  entityManager.createQuery("SELECT p FROM user_info p").getResultList();
    }
}
