package bbro.iut_book_v01.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.io.IOException;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private long uuId;
    private String fullName;
    @Column(unique = true)
    private String studentId;

    private String groupNumber;
    private String faculty;
    private String department;
    private String password;



    public Student() {
    }
    public Student(String jsonString) {
        Student student = new Student();
        try {
            student = new ObjectMapper().readValue(jsonString, Student.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.uuId = student.uuId;
        this.fullName = student.fullName;
        this.studentId = student.studentId;
        this.groupNumber = student.groupNumber;
        this.faculty = student.faculty;
        this.password = student.password;

    }

    public long getUuId() {
        return uuId;
    }

    public void setUuId(long uuId) {
        this.uuId = uuId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean matchesPassword(Student studentFromBase){
        return passwordEncoder().matches(password, studentFromBase.getPassword());
    }
    public Student encodePassword(){
        password = passwordEncoder().encode(password);
        return this;
    }
    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
