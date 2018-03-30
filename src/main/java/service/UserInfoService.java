package service;

import DAO.implement.UserInfoDAOImpl;
import models.main.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.defoultService.IDAOEntityService;

@Service
public class UserInfoService extends IDAOEntityService<UserInfoDAOImpl,UserInfo> {

    @Transactional(readOnly = true)
    public UserInfo findByName(String name){
        return (UserInfo) dao.getByName(name);
    }

    @Transactional(readOnly = true)
    public UserInfo findByLastName(String name){
        return (UserInfo) dao.getByLastName(name);
    }

    @Transactional(readOnly = true)
    public UserInfo getByNameLastNameCombination(String name, String lastName){
        return (UserInfo) dao.getByCombination(name, lastName);
    }

}
