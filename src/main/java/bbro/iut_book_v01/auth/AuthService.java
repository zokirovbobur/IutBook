package bbro.iut_book_v01.auth;

import bbro.iut_book_v01.student.Student;
import bbro.iut_book_v01.student.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    StudentRepo studentRepo;

    public ResponseEntity<Long> login(Student student){

        Student studentFromBase = studentRepo.findByStudentId(student.getStudentId());
        if(student.matchesPassword(studentFromBase)){

            return ResponseEntity.ok(studentFromBase.getUuId());
        }
        else {
            return ResponseEntity.badRequest().body(0L);

        }
    }

    @Bean
    public PasswordEncoder passwordEncoder2() {
        return new BCryptPasswordEncoder();
    }

}
