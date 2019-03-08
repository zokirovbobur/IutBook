package bbro.iut_book_v01.personalCabinet.interests;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Interest {
    @Id
    @GeneratedValue
    private long interestId;

}
