package Controller;

import bo.BOFactory;
import bo.custom.StudentBO;
import com.jfoenix.controls.JFXTextField;
import dto.tm.StudentTM;
import entity.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentFormController implements Initializable {
    public AnchorPane studentformcontxt;
    public ComboBox cmbGender;
    public JFXTextField txtGender;
    public JFXTextField txtDOB;
    public JFXTextField txtContact;
    public JFXTextField txtAddress;
    public JFXTextField txtName;
    public JFXTextField txtId;



    Student student = new Student();

//    private ObservableList<StudentTM> studentTMS = FXCollections.observableArrayList();

    private StudentBO studentBO;
    public void saveOnAction(ActionEvent actionEvent) {
        String studentId = txtId.getText();
        String studentName = txtName.getText();
        String address = txtAddress.getText();
        String contact = txtContact.getText();
        String dob = txtDOB.getText();
        String gender = txtGender.getText();

        Student student1= new Student(studentId, studentName, address, contact, dob, gender);

        studentBO.saveStudent(student1);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> gender = FXCollections.observableArrayList();
        gender.add("Male");
        gender.add("Female");
        cmbGender.setItems(gender);

        studentBO = BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);


    }
//    private void setId() {
//        StudentBO studentBO = BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);
//        String lastStudentId = studentBO.ge();
//        if (lastStudentId == null) {
//            lblStudentId.setText("S0001");
//        } else {
//            String[] split = lastStudentId.split("[S]");
//            int lastDigits = Integer.parseInt(split[1]);
//            lastDigits++;
//            String newStudentId = String.format("S%04d", lastDigits);
//            lblStudentId.setText(newStudentId);
//        }
//    }
}
