package bo;

import bo.custom.StudentBO;
import bo.custom.impl.StudentBOImpl;

//
//import bo.custom.CustomerBO;
//import bo.custom.impl.CustomerBOImpl;
//
public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getInstance(){
        return boFactory == null ? (boFactory = new BOFactory()) : boFactory;
    }

    public enum BOTypes {
        STUDENT;
    }

    public StudentBO getBO(BOTypes type){
        switch (type) {
            case STUDENT: return new StudentBOImpl();
            default: return null;
        }
    }
}


