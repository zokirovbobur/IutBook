package bbro.iut_book_v01.personalCabinet.interests.InterestType;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestTypeRepo extends JpaRepository<InterestType,Long> {
    boolean existsByInterestTypeId(long id);
    boolean existsByInterestType(String type);
    //boolean existsByInterestTypeId(long id);
}
