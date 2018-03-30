package DAO.DAOInterfaces;

import models.main.Project;

import java.util.List;

public interface IProjectDAO extends IDAOEntity<Project>{

    public Project getByTitle(String title);
    public List<Project> getByLike(int value);
    public List<Project> getByLike(int min, int max);


}
