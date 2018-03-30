package DAO.implement;

import DAO.DAOInterfaces.IRecordDAO;
import models.main.Recrord;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RecordDAOImpl implements IRecordDAO{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Recrord getByTitle(String title) {
        return (Recrord) entityManager.createQuery("SELECT p FROM Recrord p WHERE p.title = :title")
                .setParameter("title",title)
                .getSingleResult();
    }

    @Override
    public List<Recrord> getByLike(int value) {
        return entityManager.createQuery("SELECT p FROM Recrord p WHERE p.likes = :likes")
                .setParameter("likes",value)
                .getResultList();
    }

    @Override
    public List<Recrord> getByLike(int min, int max) {
        return (List<Recrord>) entityManager.
                createNativeQuery("SELECT * FROM Recrord WHERE likes BETWEEN " + min + " and " + max);
    }

    public void saveOrUpdate(Recrord project){
        entityManager.persist(project);
    }


    @Override
    public void remove(Recrord tag) {
        Recrord temporary = entityManager.merge(tag);
        entityManager.remove(temporary);
    }

    @Override
    public void removeById(Long id) {
        Recrord temporary = entityManager.find(Recrord.class, id);
        entityManager.remove(temporary);

    }

    @Override
    public Recrord getByID(Long id) {
        return entityManager.find(Recrord.class, id);
    }

    @Override
    public List<Recrord> getAll() {
        return entityManager.createQuery("SELECT p FROM Recrord p").getResultList();
    }

}
