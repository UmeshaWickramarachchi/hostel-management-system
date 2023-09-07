package dto;


import entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

        private String studentId;
        private String studentName;
        private String address;
        private String contact;
        private String dob;
        private String gender;

    @ToString.Exclude
    private List<Reservation> list=new ArrayList<>();


    public Student(String studentId, String studentName, String address, String contact, String dob, String gender) {
    }
}
