package bbro.iut_book_v01.personalCabinet.interests;

import bbro.iut_book_v01.personalCabinet.interests.InterestCategory.InterestCategory;
import bbro.iut_book_v01.personalCabinet.interests.InterestCategory.InterestCategoryRepo;
import bbro.iut_book_v01.personalCabinet.interests.InterestType.InterestType;
import bbro.iut_book_v01.personalCabinet.interests.InterestType.InterestTypeRepo;
import bbro.iut_book_v01.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterestService {
    @Autowired
    private InterestRepo interestRepo;
    @Autowired
    private InterestTypeRepo typeRepo;
    @Autowired
    private InterestCategoryRepo categoryRepo;

    //all save methods should be checked by format string 'String' is equal to 'string'

    public ResponseEntity<String> save(Interest interest){
        if (interest.getInterestType()==null){
            return ResponseEntity.badRequest().body("interestType is missing");
        }else if(interest.getStudent()==null){
            return ResponseEntity.badRequest().body("student is missing");
        }else if(!typeRepo.existsByInterestTypeId(interest.getInterestType().getInterestTypeId())){
            return ResponseEntity.badRequest().body("Interest Type is incorrect");
        }else if(!categoryRepo.existsByInterestCategoryId(interest.getInterestType()
        .getInterestCategory().getInterestCategoryId()
        )){
            return ResponseEntity.badRequest().body("Interest category is incorrect");
        }


        else {
            interestRepo.save(interest);
            return ResponseEntity.ok("saved");
        }
    }

    public ResponseEntity<String> saveType(InterestType type){
        if (type.getInterestCategory()==null){
            return ResponseEntity.badRequest().body("interest category is missing");
        }else if(!categoryRepo.existsByInterestCategoryId(type.getInterestCategory().getInterestCategoryId())){
            return ResponseEntity.badRequest().body("Interest category is incorrect");
        }else if (typeRepo.existsByInterestType(type.getInterestType())){
            return ResponseEntity.badRequest().body("interest type with this name is already exists");
        }

        else {
            typeRepo.save(type);
            return ResponseEntity.ok("saved");
        }
    }

    public ResponseEntity<String> saveCategory(InterestCategory category){
        if (categoryRepo.existsByInterestCategory(category.getInterestCategory())){
            return ResponseEntity.badRequest().body("interest category with this name is already exists");
        }else {
            categoryRepo.save(category);
            return ResponseEntity.ok("saved");
        }
    }

    public List<Interest> findAll(){
        return interestRepo.findAll();
    }
    public List<InterestType> findAllType(){
        return typeRepo.findAll();
    }
    public List<InterestCategory> findAllCategory(){
        return categoryRepo.findAll();
    }

    public List<Student> findAllStudentsByInterest(InterestType interestType){
        List <Interest> interests = interestRepo.findAllByInterestType_InterestTypeId(interestType.getInterestTypeId());
        List <Student> students = new ArrayList<>();
        interests.forEach(interest -> students.add(interest.getStudent()));
        return students;
    }
    public List<Interest> findAllByStudent(Student student){
        return interestRepo.findAllByStudent_Uuid(student.getUuid());
    }


}
