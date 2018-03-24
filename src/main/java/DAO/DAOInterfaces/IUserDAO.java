package DAO.DAOInterfaces;


import models.main.User;

import java.util.List;

public interface IUserDAO extends IDAOEntity<User>{

    public List<User> getByName();
    public List<User> getByLastName();
    public List<User> getByCombination(String name, String lastName);


}
