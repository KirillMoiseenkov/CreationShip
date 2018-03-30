package service;

import DAO.implement.RecordDAOImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.defoultService.IDAOEntityService;
import  models.main.Recrord;

import java.util.List;

@Service
public class RecordService extends IDAOEntityService<RecordDAOImpl, Recrord> {

    @Transactional
    public Recrord getByTitle(String title){return dao.getByTitle(title);}

    @Transactional
    public List<Recrord> getByLike(int value){return dao.getByLike(value);}

    @Transactional
    public List<Recrord> getByLike(int min, int max){return dao.getByLike(min,max);}


}
