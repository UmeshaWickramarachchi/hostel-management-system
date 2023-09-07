package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation {
    @Id
    private String res_id;
    private String date;
//    private String student_id;
//    private String room_type_id;
    private String status;

    @ManyToOne
    private Student student;

    public Reservation(String res_id, String date, String status, Student student) {
        this.res_id = res_id;
        this.date = date;
        this.status = status;
        this.student = student;
    }

    public void setRes_id(String res_id) {
        this.res_id = res_id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getRes_id() {
        return res_id;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public Student getStudent() {
        return student;
    }
}
