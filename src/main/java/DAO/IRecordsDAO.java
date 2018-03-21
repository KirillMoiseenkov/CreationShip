package DAO;

import models.abstractModel.Records;


public interface IRecordsDAO extends IDAOEntity<Records>{

        public Records getByTitle();
        public Records getByLike(int min);
        public Records getByLike(int min, int max);

}
