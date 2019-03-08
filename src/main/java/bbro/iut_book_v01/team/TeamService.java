package bbro.iut_book_v01.team;

import bbro.iut_book_v01.student.Student;
import bbro.iut_book_v01.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepo teamRepo;

    public ResponseEntity<String> save(Team team){


        int res = smartSave(team);
        if(res == 0){
            return ResponseEntity.badRequest()
                    .body("Required data is not given:\n" +
                            "studentRequest\n" +
                            "maxNoOfStudents");
        }
        else if(res==3){
            return ResponseEntity.badRequest().body("team is already fulfilled");
        }else if(res==1){
            return ResponseEntity.ok("teamSearch record added successfully");
        }else{
            return ResponseEntity.ok("new team member has been added to team successfully");
        }
    }
    //function recognizes if team exists or not
    //and saves it with records;
    public int smartSave(Team team){
        int res;
        if(team.getStudentRequest()==null || team.getMaxNoOfStudents()==0){
            System.out.println("inside null data");
            res = 0;
        }
        else if(team.getTeamId()==0){
            // case of new record
            res = 1;
            List<Student> initStudent = new ArrayList<>();
            initStudent.add(team.getStudentRequest());
            team.setStudentResponse(initStudent);
            teamRepo.save(team);
        }else{
            Team teamFromBase = teamRepo.findByTeamId(team.getTeamId());
            if(teamFromBase.isFilled()){
                //case of fulfilled case
                res = 3;
            }else {
                //case of add new team member
                res = 2;
                teamFromBase.addNewTeamMember(team.getStudentResponse().get(0));
                teamRepo.save(teamFromBase);
            }

        }
        return res;
    }

    public List<Team> findAll(){
        List<Team> teams = teamRepo.findAll();
        teams.forEach(team -> {
            team.getStudentRequest().nullUuid();
           // team.getStudentRequest().setPassword("");
            team.getStudentResponse().forEach(student -> {
                student.nullUuid();
                //student.setPassword("");
            });
        });
        return teams;
    }

    public ResponseEntity<String> delete(Team team){
        teamRepo.delete(team);
        return ResponseEntity.ok("team deleted");
    }

    public List<Team> findAllByFS(Subject subject){
        return teamRepo.findAllBySubjectFs(subject.getFs());
    }


}
