package DAO.DAOInterfaces;

import java.util.List;

public interface IDAOEntity <T> {

    public T getByID();
    public List<T> getAll();

}
