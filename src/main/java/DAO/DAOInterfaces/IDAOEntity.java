package DAO.DAOInterfaces;

import java.util.List;

public interface IDAOEntity <T> {

    public void saveOrUpdate(T t);
    public void remove(T t);
    public void removeById(Long id);
    public T getByID(Long id);
    public List<T> getAll();

}
