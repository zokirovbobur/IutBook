package bbro.iut_book_v01.team;

import bbro.iut_book_v01.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping
    public Team sample(){return new Team(new ArrayList<>());}

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Team team){
        return teamService.save(team);
    }

    @GetMapping("all")
    public List<Team> getAll(){
        return teamService.findAll();
    }

    @PostMapping("byFS")
    public List<Team> findAllByFs(@RequestBody Subject subject){
        return teamService.findAllByFS(subject);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody Team team){
        return ResponseEntity.badRequest().body("delete function allowed only for admin only");
    }

}
