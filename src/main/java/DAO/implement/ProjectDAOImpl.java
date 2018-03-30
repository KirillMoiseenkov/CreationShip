package DAO.implement;

import DAO.DAOInterfaces.IProjectDAO;
import models.main.Project;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProjectDAOImpl implements IProjectDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Project getByTitle(String title) {
        return (Project) entityManager.createQuery("SELECT p FROM project p WHERE p.title = :title")
                .setParameter("title",title)
                .getSingleResult();
    }

    @Override
    public List<Project> getByLike(int value) {
        return entityManager.createQuery("SELECT p FROM project p WHERE p.likes = :likes")
                .setParameter("likes",value)
                .getResultList();
    }

    @Override
    public List<Project> getByLike(int min, int max) {
        return (List<Project>) entityManager.
                createNativeQuery("SELECT * FROM project WHERE likes BETWEEN " + min + " and " + max);
    }

    public void saveOrUpdate(Project project){
        entityManager.persist(project);
    }


    @Override
    public void remove(Project tag) {
        Project temporary = entityManager.merge(tag);
        entityManager.remove(temporary);
    }

    @Override
    public void removeById(Long id) {
        Project temporary = entityManager.find(Project.class, id);
        entityManager.remove(temporary);

    }

    @Override
    public Project getByID(Long id) {
        return entityManager.find(Project.class, id);
    }

    @Override
    public List<Project> getAll() {
        return entityManager.createQuery("SELECT p FROM project p").getResultList();
    }
}
