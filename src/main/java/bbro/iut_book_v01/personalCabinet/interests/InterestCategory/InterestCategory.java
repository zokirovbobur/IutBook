package bbro.iut_book_v01.personalCabinet.interests.InterestCategory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InterestCategory {
    @Id
    @GeneratedValue
    private long interestCategoryId;

    private String interestCategory;



    public long getInterestCategoryId() {
        return interestCategoryId;
    }

    public void setInterestCategoryId(long interestCategoryId) {
        this.interestCategoryId = interestCategoryId;
    }

    public String getInterestCategory() {
        return interestCategory;
    }

    public void setInterestCategory(String interestCategory) {
        this.interestCategory = interestCategory.toLowerCase();
    }

    @Override
    public String toString() {
        return "InterestCategory{" +
                "interestCategoryId=" + interestCategoryId +
                ", interestCategory='" + interestCategory + '\'' +
                '}';
    }
}
