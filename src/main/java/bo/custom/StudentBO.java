package bo.custom;

import entity.Student;

import java.util.List;

public interface StudentBO {
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
    List<Student> getAllStudents();
}
