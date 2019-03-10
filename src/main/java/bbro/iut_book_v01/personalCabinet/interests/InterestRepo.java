package bbro.iut_book_v01.personalCabinet.interests;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterestRepo extends JpaRepository<Interest,Long> {
    List<Interest> findAllByInterestType_InterestTypeId(long id);
    List<Interest> findAllByStudent_Uuid(long uuid);
}
