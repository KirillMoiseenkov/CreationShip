package DAO.DAOInterfaces;

import models.main.Recrord;

import java.util.List;

public interface IRecordDAO extends IDAOEntity<Recrord>{

    public Recrord getByTitle(String title);
    public List<Recrord> getByLike(int value);
    public List<Recrord> getByLike(int min, int max);


}
