package bbro.iut_book_v01.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Student findByStudentId(String studentId);

}
