package bbro.iut_book_v01.personalCabinet.interests.achievements;

import bbro.iut_book_v01.personalCabinet.interests.InterestType.InterestType;
import bbro.iut_book_v01.personalCabinet.interests.InterestType.InterestTypeRepo;
import bbro.iut_book_v01.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementService {
    @Autowired
    private AchievementRepo achievementRepo;

    @Autowired
    private InterestTypeRepo interestTypeRepo;

    public ResponseEntity<String> save(Achievement achievement){
        if (achievement.getInterestType()==null){
            return ResponseEntity.badRequest().body("interest type is missing");
        }else if (achievement.getStudent()==null){
            return ResponseEntity
                    .badRequest().body("student is missing");
        }else if (!interestTypeRepo.existsByInterestTypeId(achievement.getInterestType().getInterestTypeId())){
            return ResponseEntity.badRequest().body("interest type is not exists");
        }else {
            achievementRepo.save(achievement);
            return ResponseEntity.ok("saved");
        }

    }
    public List<Achievement> findAll(){
        return achievementRepo.findAll();
    }
    public List<Achievement> findAllStudentsByAchievement(InterestType interestType){
        return achievementRepo.findAllByInterestType_InterestTypeId(interestType.getInterestTypeId());
    }
    public List<Achievement> findAllAchievementsOfStudentUuid(Student student){
        return achievementRepo.findAllByStudent_Uuid(student.getUuid());
    }
    public List<Achievement> findAllAchievementsOfStudentUserid(Student student){
        return achievementRepo.findAllByStudent_UserId(student.getUserId());
    }
}
