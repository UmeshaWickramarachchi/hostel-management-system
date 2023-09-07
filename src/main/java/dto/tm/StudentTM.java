package dto.tm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class StudentTM {

        private String studentId;
        private String studentName;
        private String address;
        private String contact;
        private String dob;
        private String gender;


}
