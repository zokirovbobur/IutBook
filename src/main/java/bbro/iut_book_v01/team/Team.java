package bbro.iut_book_v01.team;

import bbro.iut_book_v01.staff.staff.Staff;
import bbro.iut_book_v01.student.Student;
import bbro.iut_book_v01.subject.Subject;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private long teamId;

    @ManyToOne
    @JoinColumn(name = "teamReq",nullable = false)
    private Student studentRequest;

    @ManyToOne
    @JoinColumn(name = "teamProf")
    private Staff staff;

    @OneToMany
    private List<Student> studentResponse;


    @ManyToOne
    @JoinColumn(name = "teamSubject")
    private Subject subject;

    @Column(nullable = false)
    private int maxNoOfStudents;

    private String comment;

    public Team() {
    }

    public Team(List<Student> studentResponse) {
        this.studentResponse = studentResponse;
    }

    public void addNewTeamMember(Student student){
        studentResponse.add(student);
    }

    public boolean isFilled(){
        return studentResponse.size() >= maxNoOfStudents;
    }
    public int remainingNoOfStudents(){return maxNoOfStudents -studentResponse.size();}

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public Student getStudentRequest() {
        return studentRequest;
    }

    public void setStudentRequest(Student studentRequest) {
        this.studentRequest = studentRequest;
    }

    public List<Student> getStudentResponse() {
        return studentResponse;
    }

    public void setStudentResponse(List<Student> studentResponse) {
        this.studentResponse = studentResponse;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getMaxNoOfStudents() {
        return maxNoOfStudents;
    }

    public void setMaxNoOfStudents(int maxNoOfStudents) {
        this.maxNoOfStudents = maxNoOfStudents;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", studentRequest=" + studentRequest +
                ", studentResponse=" + studentResponse +
                ", subject=" + subject +
                ", maxNoOfStudents=" + maxNoOfStudents +
                ", comment='" + comment + '\'' +
                '}';
    }
}
