package bbro.iut_book_v01.personalCabinet.interests.achievements;

import bbro.iut_book_v01.personalCabinet.interests.InterestType.InterestType;
import bbro.iut_book_v01.student.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Achievement {
    @Id @GeneratedValue
    private long achievementId;

    @ManyToOne
    private InterestType interestType;

    @ManyToOne
    private Student student;

    private String comment;

    public long getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(long achievementId) {
        this.achievementId = achievementId;
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
        return "Achievement{" +
                "achievementId=" + achievementId +
                ", interestType=" + interestType +
                ", student=" + student +
                ", comment='" + comment + '\'' +
                '}';
    }
}
