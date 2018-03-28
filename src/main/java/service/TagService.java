package service;

import DAO.implement.TagDAOImpl;
import models.main.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.defoultService.IDAOEntityService;

import java.util.List;

@Service
public class TagService extends IDAOEntityService<TagDAOImpl,Tag>{


    @Transactional(readOnly = true)
    public Tag findByName(String name){
        return dao.getByName(name);
    }


}
