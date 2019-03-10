package bbro.iut_book_v01.personalCabinet.interests.InterestType;

import bbro.iut_book_v01.personalCabinet.interests.InterestCategory.InterestCategory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InterestType {
    @Id
    @GeneratedValue
    private long interestTypeId;

    @ManyToOne
    private InterestCategory interestCategory;

    private String interestType;

    public long getInterestTypeId() {
        return interestTypeId;
    }

    public void setInterestTypeId(long interestTypeId) {
        this.interestTypeId = interestTypeId;
    }

    public InterestCategory getInterestCategory() {
        return interestCategory;
    }

    public void setInterestCategory(InterestCategory interestCategory) {
        this.interestCategory = interestCategory;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    @Override
    public String toString() {
        return "InterestType{" +
                "interestTypeId=" + interestTypeId +
                ", interestCategory=" + interestCategory +
                ", interestType='" + interestType + '\'' +
                '}';
    }
}
