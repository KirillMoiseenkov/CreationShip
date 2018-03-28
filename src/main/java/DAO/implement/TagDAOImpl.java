package DAO.implement;

import DAO.DAOInterfaces.ITagDAO;
import models.main.Tag;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TagDAOImpl implements ITagDAO{

    @PersistenceContext
    public EntityManager entityManager;


    @Override
    public void remove(Tag tag) {
        Tag temporary = entityManager.merge(tag);
        entityManager.remove(temporary);
    }

    @Override
    public void removeById(Long id) {
        Tag temporary = entityManager.find(Tag.class, id*1L);
        entityManager.remove(temporary);

    }


    @Override
    public Tag getByID(Long id) {
        return entityManager.find(Tag.class, id);
    }

    public void saveOrUpdate(Tag testUser){
        entityManager.persist(testUser);
    }


    @Override
    public List<Tag> getAll() {
        return entityManager.createQuery("SELECT p FROM Tag p").getResultList();
    }

    @Override
    public Tag getByName(String name) {
      return (Tag) entityManager.createQuery("SELECT p FROM Tag p WHERE p.name = :name").setParameter("name",name).getResultList().get(0);

    }
}
