package bbro.iut_book_v01.personalCabinet.interests;

import bbro.iut_book_v01.personalCabinet.interests.InterestType.InterestType;
import bbro.iut_book_v01.student.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Interest {
    @Id
    @GeneratedValue
    private long interestId;

    @ManyToOne
    private InterestType interestType;

    @ManyToOne
    private Student student;

    private String comment;

    public long getInterestId() {
        return interestId;
    }

    public void setInterestId(long interestId) {
        this.interestId = interestId;
    }

    public InterestType getInterestType() {
        return interestType;
    }

    public void setInterestType(InterestType interestType) {
        this.interestType = interestType;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Interest{" +
                "interestId=" + interestId +
                ", interestType=" + interestType +
                ", student=" + student +
                ", comment='" + comment + '\'' +
                '}';
    }
}
