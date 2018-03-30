package DAO.implement.EntityDAOImpl;

import DAO.DAOInterfaces.IDAOEntity;
import models.main.User;
import org.springframework.core.GenericTypeResolver;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EntityDAOImpl<T> implements IDAOEntity<T> {

    private  Class<T> genericType= (Class<T>)
            GenericTypeResolver.resolveTypeArgument(getClass(), EntityDAOImpl.class);

    private  Class<T> getGenericType;

    @PersistenceContext
    public EntityManager entityManager;




    public void setGetGenericType() throws ClassNotFoundException {

        System.out.println("123 " + Class.forName(getGenericType.getName()));
        System.out.println(genericType);
        System.out.println(User.class);
    }



    @Override
    public void remove(T tag) {
        T temporary = entityManager.merge(tag);
        entityManager.remove(temporary);
    }

    @Override
    public void removeById(Long id) {
        Object Pretemporary = null;
        try {
            Pretemporary = entityManager.find(Class.forName(genericType.getName()), id);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        T temporary = (T) Pretemporary;
        entityManager.remove(temporary);

    }

    @Override
    public T getByID(Long id){
        try {
            return entityManager.find((Class<T>) Class.forName(getGenericType.getName()), id);
        }
        catch (ClassNotFoundException e)
        {
            return null;
        }
        }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
        public void saveOrUpdate(T t){

            entityManager.persist(t);
    }


}




