package DAO.DAOInterfaces;

import models.main.Tag;

public interface ITagDAO extends IDAOEntity<Tag>{

        public Tag getByName(String name);

}
