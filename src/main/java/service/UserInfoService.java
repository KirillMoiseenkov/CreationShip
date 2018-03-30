package service;

import DAO.implement.UserInfoDAOImpl;
import models.main.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.defoultService.IDAOEntityService;

import java.util.List;

@Service
public class UserInfoService extends IDAOEntityService<UserInfoDAOImpl,UserInfo> {

    @Transactional(readOnly = true)
    public List<UserInfo > findByName(String name){
        return (List<UserInfo >) dao.getByName(name);
    }

    @Transactional(readOnly = true)
    public List<UserInfo > findByLastName(String name){
        return (List<UserInfo >) dao.getByLastName(name);
    }

    @Transactional(readOnly = true)
    public List<UserInfo > getByNameLastNameCombination(String name, String lastName){
        return (List<UserInfo >) dao.getByCombination(name, lastName);
    }

}
