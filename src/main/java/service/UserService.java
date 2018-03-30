package service;

import DAO.DAOInterfaces.IUserDAO;
import models.main.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.defoultService.IDAOEntityService;


@Service
public class UserService extends IDAOEntityService<IUserDAO,User> {

    @Transactional(readOnly = true)
    public User findByName(String name){
        return (User) dao.getByName(name);
    }

    @Transactional(readOnly = true)
    public User findByLastName(String name){
        return (User) dao.getByLastName(name);
    }

    @Transactional(readOnly = true)
    public User getByCombination(String name, String lastName){
        return (User) dao.getByNameLastNameCombination(name, lastName);
    }

    @Transactional(readOnly = true)
    public User getByLogin(String login){
        return (User) dao.getByLogin(login);
    }

    @Transactional(readOnly = true)
    public User getByPassword(String password){
        return (User) dao.getByPassword(password);
    }

    @Transactional(readOnly = true)
    public User getByCombinationLoginPassword(String login, String password){
        return (User) dao.getByPasswordLoginCombination(login, password);
    }



}
