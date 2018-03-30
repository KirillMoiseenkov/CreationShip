package DAO.DAOInterfaces;

import models.main.UserInfo;

import java.util.List;

public interface IUserInfoDAO extends IDAOEntity<UserInfo>{

    public List getByName(String name);
    public List getByLastName(String lastName);
    public List getByCombination(String name, String lastName);


}
