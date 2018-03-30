package DAO.DAOInterfaces;


import models.main.User;

import java.util.List;

public interface IUserDAO extends IDAOEntity<User>{

    public List getByName(String name);
    public List getByLastName(String lastName);
    public List getByNameLastNameCombination(String name, String lastName);

    public List getByPassword(String password);
    public List getByLogin(String login);
    public List getByPasswordLoginCombination(String login, String password);



}
