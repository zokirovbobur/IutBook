package bbro.iut_book_v01.staff.staff.staffType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("staffType")
public class StaffTypeController {
    @Autowired
    private StaffTypeRepo staffTypeRepo;

    @GetMapping
    public StaffType sample(){return new StaffType();}

    @PostMapping
    public ResponseEntity<String> add(@RequestBody StaffType staffType){
        if (staffTypeRepo.existsByStaffTypeValue(staffType.getStaffTypeValue())){
            return ResponseEntity.badRequest().body("such staff type exists already");
        }else {
            staffTypeRepo.save(staffType);
            return ResponseEntity.ok("new staff type added");
        }


    }
    @GetMapping("all")
    public List<StaffType> findAll(){
        return staffTypeRepo.findAll();
    }
}
