package bo.custom.impl;

import bo.custom.StudentBO;
import dao.DAOFactory;
import dao.custom.StudentDAO;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class StudentBOImpl implements StudentBO {
    private StudentDAO studentDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);

    @Override
    public void saveStudent(Student student) {
        entity.Student student1 = new entity.Student(student.getStudentId(), student.getStudentName(), student.getAddress(), student.getContact(), student.getDob(), student.getGender());
        studentDAO.save(student1);

    }

//    @Override
//    public String getLastId() {
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//        try{
//            String lastId = studentDAO.getLastId(session);
//            transaction.commit();
//            return lastId;
//        }catch(Exception e){
//            transaction.rollback();
//            return null;
//        }finally {
//            session.close();
//        }
//    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public List<Student> getAllStudents() {
        List<entity.Student> all = studentDAO.getAll();
        List<Student> students = new ArrayList<>();

        for (entity.Student student : all) {
            students.add(new Student(student.getStudentId(), student.getStudentName(), student.getAddress(), student.getContact(), student.getDob(), student.getGender()));
        }

        return students;
    }
}
