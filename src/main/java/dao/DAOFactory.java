package dao;

import dao.custom.StudentDAO;

import dao.custom.impl.StudentDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        return daoFactory == null ? (daoFactory = new DAOFactory()) : daoFactory;
    }

    public enum DAOTypes {
        STUDENT;
    }

    public StudentDAO getDAO(DAOTypes type){
        switch (type) {
            case STUDENT: return new StudentDAOImpl();
            default: return null;
        }
    }
}
