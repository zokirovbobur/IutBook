package bbro.iut_book_v01.tutorialContent;

import bbro.iut_book_v01.personalCabinet.interests.InterestType.InterestType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TutorialVideo {
    @Id
    @GeneratedValue
    private long tutorialVideoId;

    @ManyToOne
    private InterestType interestType;

    private String url;

}
