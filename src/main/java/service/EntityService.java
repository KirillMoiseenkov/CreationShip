package service;

import DAO.DAOInterfaces.IDAOEntity;
import DAO.implement.EntityDAOImpl.EntityDAOImpl;
import models.main.User;
import org.springframework.stereotype.Service;
import service.defoultService.IDAOEntityService;

@Service
public class EntityService extends IDAOEntityService<EntityDAOImpl,User>{



}
