package bbro.iut_book_v01.personalCabinet.interests;

import bbro.iut_book_v01.personalCabinet.interests.InterestCategory.InterestCategory;
import bbro.iut_book_v01.personalCabinet.interests.InterestType.InterestType;
import bbro.iut_book_v01.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("interest")
public class InterestController {
    @Autowired
    private InterestService interestService;

    //list of students by interestType
    @PostMapping("byInterestType")
    public List<Student> findAllType(@RequestBody InterestType interestType){
        return interestService.findAllStudentsByInterest(interestType);
    }

    //list of interest of one student
    @PostMapping("byStudent")
    public List<Interest> findAllInterests(@RequestBody Student student){
        return interestService.findAllByStudent(student);
    }

    //work with interest
    @GetMapping
    public Interest sampleInterest(){
        return new Interest();
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Interest interest){
        return interestService.save(interest);
    }

    @GetMapping("all")
    public List<Interest> findAll(){
        return interestService.findAll();
    }

    // work with interest types

    @GetMapping("type")
    public InterestType sampleType(){
        return new InterestType();
    }

    @PostMapping("type")
    public ResponseEntity<String> saveType(@RequestBody InterestType type){
        return interestService.saveType(type);
    }

    @GetMapping("type/all")
    public List<InterestType> findAllType(){
        return interestService.findAllType();
    }

    // work with interest categories

    @GetMapping("category")
    public InterestCategory sampleCategory(){
        return new InterestCategory();
    }

    @PostMapping("category")
    public ResponseEntity<String> saveCategory(@RequestBody InterestCategory interestCategory){
        return interestService.saveCategory(interestCategory);
    }

    @GetMapping("category/all")
    public List<InterestCategory> findAllCategories(){
        return interestService.findAllCategory();
    }
}
