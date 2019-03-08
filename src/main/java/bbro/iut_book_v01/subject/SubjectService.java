package bbro.iut_book_v01.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepo repo;

    public ResponseEntity<String> save(Subject subject){
        if(subject.getSubjectName()==null || subject.getFs()==0){
            return ResponseEntity.badRequest().body(
                    "required data: subjectName, fs");
        }else {
            try{
                repo.findBySubjectName(subject.getSubjectName())
                        .getSubjectId();
                return ResponseEntity.badRequest().body("subject with name '" +
                        subject.getSubjectName()+"' is already exists"
                );
            }catch (NullPointerException e){
                repo.save(subject);
                return ResponseEntity.ok("subject has been added successfully");
            }

        }


    }
    public ResponseEntity<String> delete(Subject subject){
        try {
            repo.delete(subject);
            return ResponseEntity.ok("subject has been deleted successfully");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body("something wrong with subject, maybe subject connected to other data objects");
        }

    }
    public List<Subject> findAll(){return repo.findAll();}

    public List<Subject> findAllByFS(Subject subject){

        return repo.findAllByFs(subject.getFs());
    }

    public Subject findBySubjectName(Subject subject){
        return repo.findBySubjectName(subject.getSubjectName());
    }

}
