package bbro.iut_book_v01.timetable;

import bbro.iut_book_v01.group.Group_;
import bbro.iut_book_v01.student.Student;
import bbro.iut_book_v01.student.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.plugin.dom.core.Text;

import java.sql.Blob;

@RestController
@RequestMapping("tt")
public class TimetableController {
    @Autowired
    private TimetableService timetableService;
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping
    public Timetable sample(){return new Timetable();}

    @PostMapping("byStudent")
    public String byStudent(@RequestBody Student student){
        Student studentFromBase = studentRepo.findByUuid(student.getUuid());
        Group_ group = studentFromBase.getGroup();
        String groupName = group.getDepartment()+group.getNoOfGroup();
        return timetableService.findTimeTableByGroupName(groupName);
    }

}
