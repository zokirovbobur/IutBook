package bbro.iut_book_v01.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public Student sample(){
        return new Student();
    }
    @GetMapping("all")
    public List<Student> getAll(){return studentService.findAll();}
    @PostMapping
    public ResponseEntity<String> post(@RequestBody String student){
        return studentService.save(new Student(student) );
    }
    @PutMapping
    public ResponseEntity<String> put(@RequestBody String student){
        return studentService.update(new Student(student));
    }
    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody String student){
        return studentService.delete(new Student(student));
    }

}
