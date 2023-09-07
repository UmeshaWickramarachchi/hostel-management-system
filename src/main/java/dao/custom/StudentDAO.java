package dao.custom;

import entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    void update(Student student);
    void delete(Student student);
    List<Student> getAll();
}
