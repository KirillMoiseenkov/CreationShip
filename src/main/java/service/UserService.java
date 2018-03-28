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


}
