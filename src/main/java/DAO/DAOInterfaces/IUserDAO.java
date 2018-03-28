package DAO.DAOInterfaces;


import models.main.User;

import java.util.List;

public interface IUserDAO extends IDAOEntity<User>{

    public List getByName(String name);
    public List getByLastName(String lastName);
    public List getByCombination(String name, String lastName);


}
