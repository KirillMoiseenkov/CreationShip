package service;

import DAO.implement.ProjectDAOImpl;
import models.main.Project;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.defoultService.IDAOEntityService;

import java.util.List;

@Service
public class ProjectService extends IDAOEntityService<ProjectDAOImpl,Project> {

    @Transactional
    public Project getByTitle(String title){return dao.getByTitle(title);}

    @Transactional
    public List<Project> getByLike(int value){return dao.getByLike(value);}

    @Transactional
    public List<Project> getByLike(int min, int max){return dao.getByLike(min,max);}



}
