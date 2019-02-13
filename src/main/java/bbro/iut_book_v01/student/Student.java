package bbro.iut_book_v01.student;

import com.fasterxml.jackson.databind.ObjectMapper;
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
    private String userId;

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
        this.userId = student.userId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "Student{" +
                "uuId=" + uuId +
                ", fullName='" + fullName + '\'' +
                ", userId='" + userId + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
