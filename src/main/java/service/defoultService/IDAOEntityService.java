package service.defoultService;

import DAO.DAOInterfaces.IDAOEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public abstract class IDAOEntityService<DAO extends IDAOEntity, Model> {

    protected DAO dao;

    @Autowired
    public void setTestUserDAO(DAO dao) {
        this.dao = dao;
    }


    @Transactional
    public void saveOrUpdate(Model model) {

        dao.saveOrUpdate(model);
    }

    @Transactional
    public void remove(Model model) {
        dao.remove(model);

    }

    @Transactional
    public void removeByID(Long id) {
        dao.removeById(id);

    }

    @Transactional(readOnly = true)
    public Model getById(Long id) {
        return (Model) dao.getByID(id);
    }


    @Transactional(readOnly = true)
    public List<Model> findAll() {
        return dao.getAll();
    }

}
