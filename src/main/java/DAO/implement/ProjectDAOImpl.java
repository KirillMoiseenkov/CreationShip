package DAO.implement;

import DAO.DAOInterfaces.IProjectDAO;
import models.main.Project;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProjectDAOImpl implements IProjectDAO {

    private static final Logger log = Logger.getLogger(ProjectDAOImpl.class);

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Project getByTitle(String title) {
        Project project = (Project) entityManager.createQuery("SELECT p FROM project p WHERE p.title = :title")
                .setParameter("title",title)
                .getSingleResult();

        if(project == null)
            log.warn("get project by title return null");



        return project;
    }

    @Override
    public List<Project> getByLike(int value) {
        List<Project> projects = entityManager.createQuery("SELECT p FROM project p WHERE p.likes = :likes")
                .setParameter("likes",value)
                .getResultList();

        if(projects == null)
            log.warn("get project by like for single value return null");

        log.trace("\"SELECT p FROM project p WHERE p.likes = :likes\"");

        return projects;
    }

    @Override
    public List<Project> getByLike(int min, int max) {
        List<Project> projects =  (List<Project>) entityManager.
                createNativeQuery("SELECT * FROM project WHERE likes BETWEEN " + min + " and " + max);

        if(projects == null)
            log.warn("get project by like for mon or max value return null");

        log.trace("SELECT * FROM project WHERE likes BETWEEN \" + min + \" and \" + max");

        return projects;

    }

    public void saveOrUpdate(Project project){

        entityManager.persist(project);

        log.trace("project have been added to DB");
    }


    @Override
    public void remove(Project project) {
        Project temporary = entityManager.merge(project);
        entityManager.remove(temporary);

        log.trace("project with id " + project.getId() +  " have been removed from DB");

    }

    @Override
    public void removeById(Long id) {
        Project temporary = entityManager.find(Project.class, id);
        entityManager.remove(temporary);

        log.trace("project with id "+ id + " have been removed from DB");


    }

    @Override
    public Project getByID(Long id) {

        Project project = entityManager.find(Project.class, id);

        if(project == null)
            log.warn("get project by id return null");

        log.trace("element with id" + id + " try to get");



        return project;
    }

    @Override
    public List<Project> getAll()
    {
        List<Project> projects =  entityManager.createQuery("SELECT p FROM project p").getResultList();

        if(projects == null)
            log.warn("get all return null");

        log.trace("try to get all element projects");

        return entityManager.createQuery("SELECT p FROM project p").getResultList();
    }
}
