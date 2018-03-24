package DAO.DAOInterfaces;

import models.abstractModel.Records;

import java.util.List;


public interface IRecordsDAO extends IDAOEntity<Records>{

        public Records getByTitle();
        public List<Records> getByLike(int min);
        public List<Records> getByLike(int min, int max);

}
