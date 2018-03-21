package DAO;


import models.main.User;

public interface IUserDAO extends IDAOEntity<User>{

    public User getByName();
    public User getByLastName();



}
