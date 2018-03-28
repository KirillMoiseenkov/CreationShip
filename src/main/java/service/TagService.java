package service;

import DAO.implement.TagDAOImpl;
import models.main.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TagService {

    TagDAOImpl tagDAO;

    @Autowired
    public void setTestUserDAO(TagDAOImpl tagDAO) {
        this.tagDAO = tagDAO;
    }


    @Transactional
    public void saveOrUpdate(Tag tag){

        tagDAO.saveOrUpdate(tag);
    }

    @Transactional
    public void remove(Tag tag)
    {
        tagDAO.remove(tag);

    }

    @Transactional
    public void removeByID(Long id)
    {
        tagDAO.removeById(id);

    }

    @Transactional(readOnly = true)
    public Tag getById(Long id){
        return tagDAO.getByID(id);
    }

    @Transactional(readOnly = true)
    public Tag findByName(String name){
        return tagDAO.getByName(name);
    }

    @Transactional(readOnly = true)
    public List<Tag> findAll() {
        return tagDAO.getAll();
    }

}
