package bbro.iut_book_v01.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    public ResponseEntity<String> save(Student student){
        studentRepo.save(student.encodePassword());
            return ResponseEntity.ok("user has been added successfully...");
//         try {
//             if (studentRepo.findByStudentId(student.getStudentId()).getStudentId().equals(student.getStudentId())){
//                 return ResponseEntity.badRequest().body("Student id is not free...");
//             }

//         }catch (NullPointerException e){
           
//         }
//         return ResponseEntity.badRequest().body("Something wrong");

    }
    public ResponseEntity<String> update(Student student){
        if(student.matchesPassword(studentRepo.findByStudentId(student.getStudentId()))){
            studentRepo.save(student.encodePassword());
            return ResponseEntity.ok("user's settings has been changed successfully...");
        }
        else {
            return ResponseEntity.badRequest().body("password is incorrect");

        }
    }
    public List<Student> findAll(){
        List<Student> all = studentRepo.findAll();
        all.forEach(student -> {student.setUuId(0L);student.setPassword("");});
        return all;
    }
    public ResponseEntity<String> delete(Student student){
        Student studentFromBase = studentRepo.findByStudentId(student.getStudentId());
        if(student.matchesPassword(studentFromBase)){
            studentRepo.delete(student);
            return ResponseEntity.ok("User has been deleted successfully...");
        }
        else {
            return ResponseEntity.badRequest().body("password is incorrect");

        }


    }



}
