package bbro.iut_book_v01.timetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TimetableService {
    @Autowired
    private TimetableRepo timetableRepo;

    public ResponseEntity<String> save(Timetable timetable){
        if (timetable.getGroup()==null|| timetable.getTimetable()==null){
            return ResponseEntity.badRequest().body("required fields: timetable, group");
        }else {
            timetableRepo.save(timetable);
            return ResponseEntity.ok("done");
        }
    }

    public String cie15_1(){
        return "<svg style=\"position:absolute;left:0px;top:0px;\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" stroke=\"#000000\" stroke-width=\"0\" fill=\"#000000\" width=\"891\" height=\"630\">\n" +
                "    <defs></defs>\n" +
                "    <g transform=\"scale(0.3)\">\n" +
                "        <text font-size=\"23.753674337515022\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"400.7608695652174\" y=\"335\">9:00-9:30</text>\n" +
                "        <text font-size=\"20.994946469950147\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"400.7608695652174\" y=\"411.5\">9:00 - 9:30</text>\n" +
                "        <line x1=\"456.52173913043475\" y1=\"250\" x2=\"456.52173913043475\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"20.99092493333921\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956521\" y=\"335\">9:30-10:00</text>\n" +
                "        <text font-size=\"18.807276468928865\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956521\" y=\"411.5\">9:30 - 10:00</text>\n" +
                "        <line x1=\"568.0434782608695\" y1=\"250\" x2=\"568.0434782608695\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020467\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"623.804347826087\" y=\"335\">10:00-10:30</text>\n" +
                "        <text font-size=\"17.03249342908054\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"623.804347826087\" y=\"411.5\">10:00 - 10:30</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"250\" x2=\"679.5652173913044\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"19.06912625916301\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"735.3260869565217\" y=\"335\">10:30-11:00</text>\n" +
                "        <text font-size=\"17.24981153232976\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"735.3260869565217\" y=\"411.5\">10:30 - 11:00</text>\n" +
                "        <line x1=\"791.0869565217391\" y1=\"250\" x2=\"791.0869565217391\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"19.34196181028599\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"335\">11:00-11:30</text>\n" +
                "        <text font-size=\"17.472745769739774\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"411.5\">11:00 - 11:30</text>\n" +
                "        <line x1=\"902.6086956521739\" y1=\"250\" x2=\"902.6086956521739\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"19.06912625916303\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"958.3695652173913\" y=\"335\">11:30-12:00</text>\n" +
                "        <text font-size=\"17.24981153232978\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"958.3695652173913\" y=\"411.5\">11:30 - 12:00</text>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"250\" x2=\"1014.1304347826087\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1069.891304347826\" y=\"335\">12:00-12:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1069.891304347826\" y=\"411.5\">12:00 - 12:30</text>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"250\" x2=\"1125.6521739130435\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"335\">12:30-13:00</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"411.5\">12:30 - 13:00</text>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"250\" x2=\"1237.1739130434783\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1292.9347826086955\" y=\"335\">13:00-13:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1292.9347826086955\" y=\"411.5\">13:00 - 13:30</text>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"250\" x2=\"1348.695652173913\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1404.4565217391305\" y=\"335\">13:30-14:00</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1404.4565217391305\" y=\"411.5\">13:30 - 14:00</text>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"250\" x2=\"1460.2173913043478\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1515.978260869565\" y=\"335\">14:00-14:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1515.978260869565\" y=\"411.5\">14:00 - 14:30</text>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"250\" x2=\"1571.7391304347825\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1627.5\" y=\"335\">14:30-15:00</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1627.5\" y=\"411.5\">14:30 - 15:00</text>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"250\" x2=\"1683.2608695652175\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.021739130435\" y=\"335\">15:00-15:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.021739130435\" y=\"411.5\">15:00 - 15:30</text>\n" +
                "        <line x1=\"1794.7826086956522\" y1=\"250\" x2=\"1794.7826086956522\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1850.5434782608695\" y=\"335\">15:30-16:00</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1850.5434782608695\" y=\"411.5\">15:30 - 16:00</text>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"250\" x2=\"1906.304347826087\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1962.0652173913045\" y=\"335\">16:00-16:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1962.0652173913045\" y=\"411.5\">16:00 - 16:30</text>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"250\" x2=\"2017.8260869565217\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.586956521739\" y=\"335\">16:30-17:00</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.586956521739\" y=\"411.5\">16:30 - 17:00</text>\n" +
                "        <line x1=\"2129.3478260869565\" y1=\"250\" x2=\"2129.3478260869565\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2185.108695652174\" y=\"335\">17:00-17:30</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2185.108695652174\" y=\"411.5\">17:00 - 18:00</text>\n" +
                "        <line x1=\"2240.869565217391\" y1=\"250\" x2=\"2240.869565217391\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020403\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2296.6304347826085\" y=\"335\">17:30-18:00</text>\n" +
                "        <text font-size=\"17.032493429080482\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2296.6304347826085\" y=\"411.5\">17:30 - 18:00</text>\n" +
                "        <line x1=\"2352.391304347826\" y1=\"250\" x2=\"2352.391304347826\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020403\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2408.1521739130435\" y=\"335\">18:00-18:30</text>\n" +
                "        <text font-size=\"17.032493429080482\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2408.1521739130435\" y=\"411.5\">18:00 - 18:30</text>\n" +
                "        <line x1=\"2463.913043478261\" y1=\"250\" x2=\"2463.913043478261\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2519.673913043478\" y=\"335\">18:30-19:00</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2519.673913043478\" y=\"411.5\">18:30 - 19:00</text>\n" +
                "        <line x1=\"2575.4347826086955\" y1=\"250\" x2=\"2575.4347826086955\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.80387888602057\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2631.195652173913\" y=\"335\">19:00-19:30</text>\n" +
                "        <text font-size=\"17.032493429080635\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2631.195652173913\" y=\"411.5\">19:00 - 19:30</text>\n" +
                "        <line x1=\"2686.9565217391305\" y1=\"250\" x2=\"2686.9565217391305\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2742.717391304348\" y=\"335\">19:30-20:00</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2742.717391304348\" y=\"411.5\">19:30 - 20:00</text>\n" +
                "        <line x1=\"2798.478260869565\" y1=\"250\" x2=\"2798.478260869565\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020403\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2854.2391304347825\" y=\"335\">20:00-20:30</text>\n" +
                "        <text font-size=\"17.032493429080482\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2854.2391304347825\" y=\"411.5\">20:00 - 20:30</text>\n" +
                "        <line x1=\"456.52173913043475\" y1=\"420\" x2=\"456.52173913043475\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"568.0434782608695\" y1=\"420\" x2=\"568.0434782608695\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"420\" x2=\"679.5652173913044\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"791.0869565217391\" y1=\"420\" x2=\"791.0869565217391\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"902.6086956521739\" y1=\"420\" x2=\"902.6086956521739\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"420\" x2=\"1125.6521739130435\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"420\" x2=\"1237.1739130434783\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"420\" x2=\"1348.695652173913\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"420\" x2=\"1460.2173913043478\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"420\" x2=\"1571.7391304347825\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"420\" x2=\"1683.2608695652175\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1794.7826086956522\" y1=\"420\" x2=\"1794.7826086956522\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"420\" x2=\"1906.304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"420\" x2=\"2017.8260869565217\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2129.3478260869565\" y1=\"420\" x2=\"2129.3478260869565\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2240.869565217391\" y1=\"420\" x2=\"2240.869565217391\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2352.391304347826\" y1=\"420\" x2=\"2352.391304347826\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2463.913043478261\" y1=\"420\" x2=\"2463.913043478261\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2575.4347826086955\" y1=\"420\" x2=\"2575.4347826086955\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2686.9565217391305\" y1=\"420\" x2=\"2686.9565217391305\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2798.478260869565\" y1=\"420\" x2=\"2798.478260869565\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"573\">Mo</text>\n" +
                "        <line x1=\"60\" y1=\"726\" x2=\"345\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"879\">Tu</text>\n" +
                "        <line x1=\"60\" y1=\"1032\" x2=\"345\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1185\">We</text>\n" +
                "        <line x1=\"60\" y1=\"1338\" x2=\"345\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1491\">Th</text>\n" +
                "        <line x1=\"60\" y1=\"1644\" x2=\"345\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1797\">Fr</text>\n" +
                "        <line x1=\"345\" y1=\"726\" x2=\"2910\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1032\" x2=\"2910\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1338\" x2=\"2910\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1644\" x2=\"2910\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"679.5652173913044\" y=\"420\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>IoT (1) Noh Francis Tai B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"573\">I1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"710.7\">NFT</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"710.7\">B101(160)</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"420\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1014.1304347826087\" y=\"420\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Capstone Design (1) Woosug Cho B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"573\">CD1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1331.9673913043478\" y=\"710.7\">WC</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1030.858695652174\" y=\"710.7\">B101(160)</text>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1348.695652173913\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1348.695652173913\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"420\" x2=\"1348.695652173913\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"679.5652173913044\" y=\"726\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Computer Networks (3) Ashish Seth B201(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"879\">CN3</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"1016.7\">AS</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"1016.7\">B201(80)</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1032\" x2=\"1014.1304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"726\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1906.304347826087\" y=\"726\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>E-commerce(LOG) (1) Lee Eun Taik B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.5869565217395\" y=\"879\">EaL1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2224.1413043478265\" y=\"1016.7\">LET</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1923.0326086956522\" y=\"1016.7\">B101(160)</text>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"726\" x2=\"2240.8695652173915\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"1032\" x2=\"2240.8695652173915\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"726\" x2=\"1906.304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2240.8695652173915\" y1=\"726\" x2=\"2240.8695652173915\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1014.1304347826087\" y=\"726\" width=\"223.0434782608695\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Curator Hours (9) Curator 4 B208 </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1125.6521739130435\" y=\"879\">CH9</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1226.0217391304348\" y=\"1016.7\">C4</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1025.2826086956522\" y=\"1016.7\">B208</text>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1237.1739130434783\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1032\" x2=\"1237.1739130434783\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"726\" x2=\"1237.1739130434783\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1571.7391304347825\" y=\"1032\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>IoT (1) Noh Francis Tai B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.0217391304348\" y=\"1185\">I1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1889.5760869565217\" y=\"1322.7\">NFT</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1588.4673913043478\" y=\"1322.7\">B101(160)</text>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1032\" x2=\"1906.304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1338\" x2=\"1906.304347826087\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1032\" x2=\"1571.7391304347825\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"1032\" x2=\"1906.304347826087\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1237.1739130434783\" y=\"1032\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Mobile Communication (1) Noh Francis Tai B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1404.4565217391305\" y=\"1185\">MC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1555.0108695652173\" y=\"1322.7\">NFT</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1253.9021739130435\" y=\"1322.7\">B101(160)</text>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"1032\" x2=\"1571.7391304347825\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"1338\" x2=\"1571.7391304347825\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"1032\" x2=\"1237.1739130434783\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1032\" x2=\"1571.7391304347825\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"345\" y=\"1032\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Data Communication (1) Park Jong Won B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"1185\">DC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"1322.7\">PJW</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"1322.7\">B101(160)</text>\n" +
                "        <line x1=\"345\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1338\" x2=\"679.5652173913044\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1032\" x2=\"345\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"679.5652173913044\" y=\"1032\" width=\"446.0869565217391\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Engineering Ethics (1) Djalalov Muzaffar B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"902.608695652174\" y=\"1185\">EE1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1103.3478260869565\" y=\"1322.7\">M</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"701.8695652173914\" y=\"1322.7\">B101(160)</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1032\" x2=\"1125.6521739130435\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1338\" x2=\"1125.6521739130435\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"1032\" x2=\"1125.6521739130435\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1125.6521739130435\" y=\"1338\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Computer Networks (3) Ashish Seth B210(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1292.9347826086957\" y=\"1491\">CN3</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1443.4891304347827\" y=\"1628.7\">AS</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1142.3804347826087\" y=\"1628.7\">B210(80)</text>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"1338\" x2=\"1460.217391304348\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"1644\" x2=\"1460.217391304348\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"1338\" x2=\"1125.6521739130435\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1460.217391304348\" y1=\"1338\" x2=\"1460.217391304348\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1460.2173913043478\" y=\"1338\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Data Communication (1) Park Jong Won B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1627.5\" y=\"1491\">DC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1778.0543478260868\" y=\"1628.7\">PJW</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1476.945652173913\" y=\"1628.7\">B101(160)</text>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"1338\" x2=\"1794.782608695652\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"1644\" x2=\"1794.782608695652\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"1338\" x2=\"1460.2173913043478\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1794.782608695652\" y1=\"1338\" x2=\"1794.782608695652\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"679.5652173913044\" y=\"1644\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>E-commerce(LOG) (1) Lee Eun Taik B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"1797\">EaL1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"1934.7\">LET</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"1934.7\">B101(160)</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1644\" x2=\"1014.1304347826087\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1950\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1644\" x2=\"679.5652173913044\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1644\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1014.1304347826087\" y=\"1644\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Mobile Communication (1) Noh Francis Tai B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"1797\">MC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1331.9673913043478\" y=\"1934.7\">NFT</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1030.858695652174\" y=\"1934.7\">B101(160)</text>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1644\" x2=\"1348.695652173913\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1950\" x2=\"1348.695652173913\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1644\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"1644\" x2=\"1348.695652173913\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1348.695652173913\" y=\"1644\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Capstone Design Lab (1) Woosug Cho 502(Electronic Lap)</title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1515.9782608695652\" y=\"1797\">CD1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1666.5326086956522\" y=\"1934.7\">WC</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1365.4239130434783\" y=\"1934.7\">502(Electronic Lap)</text>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"1644\" x2=\"1683.2608695652175\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"1950\" x2=\"1683.2608695652175\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"1644\" x2=\"1348.695652173913\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"1644\" x2=\"1683.2608695652175\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1683.2608695652175\" y=\"1644\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Data Communication (1) Park Jong Won B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1850.5434782608697\" y=\"1797\">DC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2001.0978260869567\" y=\"1934.7\">PJW</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1699.9891304347827\" y=\"1934.7\">B101(160)</text>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"1644\" x2=\"2017.826086956522\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"1950\" x2=\"2017.826086956522\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"1644\" x2=\"1683.2608695652175\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2017.826086956522\" y1=\"1644\" x2=\"2017.826086956522\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"60\" y1=\"250\" x2=\"2910\" y2=\"250\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"2910\" y1=\"250\" x2=\"2910\" y2=\"1950\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"2910\" y1=\"1950\" x2=\"60\" y2=\"1950\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"60\" y1=\"1950\" x2=\"60\" y2=\"250\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"345\" y1=\"250\" x2=\"345\" y2=\"1950\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"60\" y1=\"420\" x2=\"2910\" y2=\"420\" stroke-width=\"3\"></line>\n" +
                "         </g>\n" +
                "</svg>";
    }
    public String cie15_2(){
        return "<svg style=\"position:absolute;left:0px;top:0px;\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" stroke=\"#000000\" stroke-width=\"0\" fill=\"#000000\" width=\"891\" height=\"630\">\n" +
                "    <defs></defs>\n" +
                "    <g transform=\"scale(0.3)\">\n" +
                "        <text font-size=\"23.753674337515022\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"400.7608695652174\" y=\"335\">9:00-9:30</text>\n" +
                "        <text font-size=\"20.994946469950147\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"400.7608695652174\" y=\"411.5\">9:00 - 9:30</text>\n" +
                "        <line x1=\"456.52173913043475\" y1=\"250\" x2=\"456.52173913043475\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"20.99092493333921\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956521\" y=\"335\">9:30-10:00</text>\n" +
                "        <text font-size=\"18.807276468928865\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956521\" y=\"411.5\">9:30 - 10:00</text>\n" +
                "        <line x1=\"568.0434782608695\" y1=\"250\" x2=\"568.0434782608695\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020467\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"623.804347826087\" y=\"335\">10:00-10:30</text>\n" +
                "        <text font-size=\"17.03249342908054\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"623.804347826087\" y=\"411.5\">10:00 - 10:30</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"250\" x2=\"679.5652173913044\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"19.06912625916301\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"735.3260869565217\" y=\"335\">10:30-11:00</text>\n" +
                "        <text font-size=\"17.24981153232976\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"735.3260869565217\" y=\"411.5\">10:30 - 11:00</text>\n" +
                "        <line x1=\"791.0869565217391\" y1=\"250\" x2=\"791.0869565217391\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"19.34196181028599\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"335\">11:00-11:30</text>\n" +
                "        <text font-size=\"17.472745769739774\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"411.5\">11:00 - 11:30</text>\n" +
                "        <line x1=\"902.6086956521739\" y1=\"250\" x2=\"902.6086956521739\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"19.06912625916303\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"958.3695652173913\" y=\"335\">11:30-12:00</text>\n" +
                "        <text font-size=\"17.24981153232978\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"958.3695652173913\" y=\"411.5\">11:30 - 12:00</text>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"250\" x2=\"1014.1304347826087\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1069.891304347826\" y=\"335\">12:00-12:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1069.891304347826\" y=\"411.5\">12:00 - 12:30</text>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"250\" x2=\"1125.6521739130435\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"335\">12:30-13:00</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"411.5\">12:30 - 13:00</text>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"250\" x2=\"1237.1739130434783\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1292.9347826086955\" y=\"335\">13:00-13:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1292.9347826086955\" y=\"411.5\">13:00 - 13:30</text>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"250\" x2=\"1348.695652173913\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1404.4565217391305\" y=\"335\">13:30-14:00</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1404.4565217391305\" y=\"411.5\">13:30 - 14:00</text>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"250\" x2=\"1460.2173913043478\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1515.978260869565\" y=\"335\">14:00-14:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1515.978260869565\" y=\"411.5\">14:00 - 14:30</text>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"250\" x2=\"1571.7391304347825\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1627.5\" y=\"335\">14:30-15:00</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1627.5\" y=\"411.5\">14:30 - 15:00</text>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"250\" x2=\"1683.2608695652175\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.021739130435\" y=\"335\">15:00-15:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.021739130435\" y=\"411.5\">15:00 - 15:30</text>\n" +
                "        <line x1=\"1794.7826086956522\" y1=\"250\" x2=\"1794.7826086956522\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1850.5434782608695\" y=\"335\">15:30-16:00</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1850.5434782608695\" y=\"411.5\">15:30 - 16:00</text>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"250\" x2=\"1906.304347826087\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020446\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1962.0652173913045\" y=\"335\">16:00-16:30</text>\n" +
                "        <text font-size=\"17.032493429080517\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1962.0652173913045\" y=\"411.5\">16:00 - 16:30</text>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"250\" x2=\"2017.8260869565217\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.586956521739\" y=\"335\">16:30-17:00</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.586956521739\" y=\"411.5\">16:30 - 17:00</text>\n" +
                "        <line x1=\"2129.3478260869565\" y1=\"250\" x2=\"2129.3478260869565\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2185.108695652174\" y=\"335\">17:00-17:30</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2185.108695652174\" y=\"411.5\">17:00 - 18:00</text>\n" +
                "        <line x1=\"2240.869565217391\" y1=\"250\" x2=\"2240.869565217391\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020403\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2296.6304347826085\" y=\"335\">17:30-18:00</text>\n" +
                "        <text font-size=\"17.032493429080482\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2296.6304347826085\" y=\"411.5\">17:30 - 18:00</text>\n" +
                "        <line x1=\"2352.391304347826\" y1=\"250\" x2=\"2352.391304347826\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020403\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2408.1521739130435\" y=\"335\">18:00-18:30</text>\n" +
                "        <text font-size=\"17.032493429080482\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2408.1521739130435\" y=\"411.5\">18:00 - 18:30</text>\n" +
                "        <line x1=\"2463.913043478261\" y1=\"250\" x2=\"2463.913043478261\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2519.673913043478\" y=\"335\">18:30-19:00</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2519.673913043478\" y=\"411.5\">18:30 - 19:00</text>\n" +
                "        <line x1=\"2575.4347826086955\" y1=\"250\" x2=\"2575.4347826086955\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.80387888602057\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2631.195652173913\" y=\"335\">19:00-19:30</text>\n" +
                "        <text font-size=\"17.032493429080635\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2631.195652173913\" y=\"411.5\">19:00 - 19:30</text>\n" +
                "        <line x1=\"2686.9565217391305\" y1=\"250\" x2=\"2686.9565217391305\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020488\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2742.717391304348\" y=\"335\">19:30-20:00</text>\n" +
                "        <text font-size=\"17.032493429080557\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2742.717391304348\" y=\"411.5\">19:30 - 20:00</text>\n" +
                "        <line x1=\"2798.478260869565\" y1=\"250\" x2=\"2798.478260869565\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"18.803878886020403\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2854.2391304347825\" y=\"335\">20:00-20:30</text>\n" +
                "        <text font-size=\"17.032493429080482\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2854.2391304347825\" y=\"411.5\">20:00 - 20:30</text>\n" +
                "        <line x1=\"456.52173913043475\" y1=\"420\" x2=\"456.52173913043475\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"568.0434782608695\" y1=\"420\" x2=\"568.0434782608695\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"420\" x2=\"679.5652173913044\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"791.0869565217391\" y1=\"420\" x2=\"791.0869565217391\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"902.6086956521739\" y1=\"420\" x2=\"902.6086956521739\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"420\" x2=\"1125.6521739130435\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"420\" x2=\"1237.1739130434783\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"420\" x2=\"1348.695652173913\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"420\" x2=\"1460.2173913043478\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"420\" x2=\"1571.7391304347825\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"420\" x2=\"1683.2608695652175\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1794.7826086956522\" y1=\"420\" x2=\"1794.7826086956522\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"420\" x2=\"1906.304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"420\" x2=\"2017.8260869565217\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2129.3478260869565\" y1=\"420\" x2=\"2129.3478260869565\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2240.869565217391\" y1=\"420\" x2=\"2240.869565217391\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2352.391304347826\" y1=\"420\" x2=\"2352.391304347826\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2463.913043478261\" y1=\"420\" x2=\"2463.913043478261\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2575.4347826086955\" y1=\"420\" x2=\"2575.4347826086955\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2686.9565217391305\" y1=\"420\" x2=\"2686.9565217391305\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2798.478260869565\" y1=\"420\" x2=\"2798.478260869565\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"573\">Mo</text>\n" +
                "        <line x1=\"60\" y1=\"726\" x2=\"345\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"879\">Tu</text>\n" +
                "        <line x1=\"60\" y1=\"1032\" x2=\"345\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1185\">We</text>\n" +
                "        <line x1=\"60\" y1=\"1338\" x2=\"345\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1491\">Th</text>\n" +
                "        <line x1=\"60\" y1=\"1644\" x2=\"345\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1797\">Fr</text>\n" +
                "        <line x1=\"345\" y1=\"726\" x2=\"2910\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1032\" x2=\"2910\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1338\" x2=\"2910\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1644\" x2=\"2910\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"345\" y=\"420\" width=\"334.5652173913044\" height=\"153\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Signals and Systems (2) Jasurbek Khodjaev B209(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"496.5\">SaS2</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"565.35\">JK</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"565.35\">B209(80)</text>\n" +
                "        <line x1=\"345\" y1=\"420\" x2=\"679.5652173913044\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"573\" x2=\"679.5652173913044\" y2=\"573\" stroke-width=\"1\" stroke-dasharray=\"0.7,0.7\"></line>\n" +
                "        <line x1=\"345\" y1=\"420\" x2=\"345\" y2=\"573\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"420\" x2=\"679.5652173913044\" y2=\"573\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"679.5652173913044\" y=\"420\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>IoT (1) Noh Francis Tai B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"573\">I1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"710.7\">NFT</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"710.7\">B101(160)</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"420\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1571.7391304347825\" y=\"420\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Computer Architecture (4) Andrey Dragunov 202(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.0217391304348\" y=\"573\">CA4</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1889.5760869565217\" y=\"710.7\">AD</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1588.4673913043478\" y=\"710.7\">202(80)</text>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"420\" x2=\"1906.304347826087\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"726\" x2=\"1906.304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"420\" x2=\"1571.7391304347825\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"420\" x2=\"1906.304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"345\" y=\"573\" width=\"334.5652173913044\" height=\"153\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Probability and Statistics (4) Bakhodir Akhmedov B201(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"649.5\">PaS4</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"718.35\">BA</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"718.35\">B201(80)</text>\n" +
                "        <line x1=\"345\" y1=\"573\" x2=\"679.5652173913044\" y2=\"573\" stroke-width=\"1\" stroke-dasharray=\"0.7,0.7\"></line>\n" +
                "        <line x1=\"345\" y1=\"726\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"573\" x2=\"345\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"573\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1014.1304347826087\" y=\"420\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Capstone Design (1) Woosug Cho B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"573\">CD1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1331.9673913043478\" y=\"710.7\">WC</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1030.858695652174\" y=\"710.7\">B101(160)</text>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1348.695652173913\" y2=\"420\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1348.695652173913\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"420\" x2=\"1348.695652173913\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"679.5652173913044\" y=\"726\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Computer Networks (3) Ashish Seth B201(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"879\">CN3</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"1016.7\">AS</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"1016.7\">B201(80)</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1032\" x2=\"1014.1304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"726\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1906.304347826087\" y=\"726\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>E-commerce(LOG) (1) Lee Eun Taik B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.5869565217395\" y=\"879\">EaL1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2224.1413043478265\" y=\"1016.7\">LET</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1923.0326086956522\" y=\"1016.7\">B101(160)</text>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"726\" x2=\"2240.8695652173915\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"1032\" x2=\"2240.8695652173915\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"726\" x2=\"1906.304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2240.8695652173915\" y1=\"726\" x2=\"2240.8695652173915\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"345\" y=\"726\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Computer Architecture (4) Andrey Dragunov B202(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"879\">CA4</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"1016.7\">AD</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"1016.7\">B202(80)</text>\n" +
                "        <line x1=\"345\" y1=\"726\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"726\" x2=\"345\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"726\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1571.7391304347825\" y=\"726\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Capstone Design Lab (2) Woosug Cho 502(Electronic Lap)</title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.0217391304348\" y=\"879\">CD2</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1889.5760869565217\" y=\"1016.7\">WC</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1588.4673913043478\" y=\"1016.7\">502(Electronic Lap)</text>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"726\" x2=\"1906.304347826087\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1032\" x2=\"1906.304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"726\" x2=\"1571.7391304347825\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"726\" x2=\"1906.304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1014.1304347826087\" y=\"726\" width=\"223.0434782608695\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Curator Hours (9) Curator 4 B208 </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1125.6521739130435\" y=\"879\">CH9</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1226.0217391304348\" y=\"1016.7\">C4</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1025.2826086956522\" y=\"1016.7\">B208</text>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1237.1739130434783\" y2=\"726\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1032\" x2=\"1237.1739130434783\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"726\" x2=\"1237.1739130434783\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1571.7391304347825\" y=\"1032\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>IoT (1) Noh Francis Tai B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.0217391304348\" y=\"1185\">I1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1889.5760869565217\" y=\"1322.7\">NFT</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1588.4673913043478\" y=\"1322.7\">B101(160)</text>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1032\" x2=\"1906.304347826087\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1338\" x2=\"1906.304347826087\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1032\" x2=\"1571.7391304347825\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"1032\" x2=\"1906.304347826087\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1237.1739130434783\" y=\"1032\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Mobile Communication (1) Noh Francis Tai B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1404.4565217391305\" y=\"1185\">MC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1555.0108695652173\" y=\"1322.7\">NFT</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1253.9021739130435\" y=\"1322.7\">B101(160)</text>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"1032\" x2=\"1571.7391304347825\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"1338\" x2=\"1571.7391304347825\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1237.1739130434783\" y1=\"1032\" x2=\"1237.1739130434783\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1571.7391304347825\" y1=\"1032\" x2=\"1571.7391304347825\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"345\" y=\"1032\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Data Communication (1) Park Jong Won B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"1185\">DC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"1322.7\">PJW</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"1322.7\">B101(160)</text>\n" +
                "        <line x1=\"345\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1338\" x2=\"679.5652173913044\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"345\" y1=\"1032\" x2=\"345\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"679.5652173913044\" y=\"1032\" width=\"446.0869565217391\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Engineering Ethics (1) Djalalov Muzaffar B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"902.608695652174\" y=\"1185\">EE1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1103.3478260869565\" y=\"1322.7\">M</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"701.8695652173914\" y=\"1322.7\">B101(160)</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1032\" x2=\"1125.6521739130435\" y2=\"1032\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1338\" x2=\"1125.6521739130435\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"1032\" x2=\"1125.6521739130435\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1125.6521739130435\" y=\"1338\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Computer Networks (3) Ashish Seth B210(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1292.9347826086957\" y=\"1491\">CN3</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1443.4891304347827\" y=\"1628.7\">AS</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1142.3804347826087\" y=\"1628.7\">B210(80)</text>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"1338\" x2=\"1460.217391304348\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"1644\" x2=\"1460.217391304348\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1125.6521739130435\" y1=\"1338\" x2=\"1125.6521739130435\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1460.217391304348\" y1=\"1338\" x2=\"1460.217391304348\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1906.304347826087\" y=\"1338\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>History -1 (1) Qahramon Yakubov 203(90)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.5869565217395\" y=\"1491\">H-1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2224.1413043478265\" y=\"1628.7\">QY</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1923.0326086956522\" y=\"1628.7\">203(90)</text>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"1338\" x2=\"2240.8695652173915\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"1644\" x2=\"2240.8695652173915\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1906.304347826087\" y1=\"1338\" x2=\"1906.304347826087\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2240.8695652173915\" y1=\"1338\" x2=\"2240.8695652173915\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1460.2173913043478\" y=\"1338\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Data Communication (1) Park Jong Won B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1627.5\" y=\"1491\">DC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1778.0543478260868\" y=\"1628.7\">PJW</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1476.945652173913\" y=\"1628.7\">B101(160)</text>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"1338\" x2=\"1794.782608695652\" y2=\"1338\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"1644\" x2=\"1794.782608695652\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1460.2173913043478\" y1=\"1338\" x2=\"1460.2173913043478\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1794.782608695652\" y1=\"1338\" x2=\"1794.782608695652\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"2017.8260869565217\" y=\"1644\" width=\"334.56521739130426\" height=\"153\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Signals and Systems (2) Jasurbek Khodjaev B201(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2185.108695652174\" y=\"1720.5\">SaS2</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2335.663043478261\" y=\"1789.35\">JK</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2034.554347826087\" y=\"1789.35\">B201(80)</text>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"1644\" x2=\"2352.391304347826\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"1797\" x2=\"2352.391304347826\" y2=\"1797\" stroke-width=\"1\" stroke-dasharray=\"0.7,0.7\"></line>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"1644\" x2=\"2017.8260869565217\" y2=\"1797\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2352.391304347826\" y1=\"1644\" x2=\"2352.391304347826\" y2=\"1797\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"679.5652173913044\" y=\"1644\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>E-commerce(LOG) (1) Lee Eun Taik B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"1797\">EaL1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"1934.7\">LET</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"1934.7\">B101(160)</text>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1644\" x2=\"1014.1304347826087\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1950\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"679.5652173913044\" y1=\"1644\" x2=\"679.5652173913044\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1644\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1014.1304347826087\" y=\"1644\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Mobile Communication (1) Noh Francis Tai B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"1797\">MC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1331.9673913043478\" y=\"1934.7\">NFT</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1030.858695652174\" y=\"1934.7\">B101(160)</text>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1644\" x2=\"1348.695652173913\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1950\" x2=\"1348.695652173913\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1014.1304347826087\" y1=\"1644\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1348.695652173913\" y1=\"1644\" x2=\"1348.695652173913\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"2017.8260869565217\" y=\"1797\" width=\"334.56521739130426\" height=\"153\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Probability and Statistics (4) Bakhodir Akhmedov B202(80)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2185.108695652174\" y=\"1873.5\">PaS4</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2335.663043478261\" y=\"1942.35\">BA</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2034.554347826087\" y=\"1942.35\">B202(80)</text>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"1797\" x2=\"2352.391304347826\" y2=\"1797\" stroke-width=\"1\" stroke-dasharray=\"0.7,0.7\"></line>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"1950\" x2=\"2352.391304347826\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2017.8260869565217\" y1=\"1797\" x2=\"2017.8260869565217\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2352.391304347826\" y1=\"1797\" x2=\"2352.391304347826\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <rect x=\"1683.2608695652175\" y=\"1644\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\">\n" +
                "            <title>Data Communication (1) Park Jong Won B101(160)\n" +
                "            </title>\n" +
                "        </rect>\n" +
                "        <text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1850.5434782608697\" y=\"1797\">DC1</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2001.0978260869567\" y=\"1934.7\">PJW</text>\n" +
                "        <text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1699.9891304347827\" y=\"1934.7\">B101(160)</text>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"1644\" x2=\"2017.826086956522\" y2=\"1644\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"1950\" x2=\"2017.826086956522\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"1683.2608695652175\" y1=\"1644\" x2=\"1683.2608695652175\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"2017.826086956522\" y1=\"1644\" x2=\"2017.826086956522\" y2=\"1950\" stroke-width=\"1\"></line>\n" +
                "        <line x1=\"60\" y1=\"250\" x2=\"2910\" y2=\"250\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"2910\" y1=\"250\" x2=\"2910\" y2=\"1950\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"2910\" y1=\"1950\" x2=\"60\" y2=\"1950\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"60\" y1=\"1950\" x2=\"60\" y2=\"250\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"345\" y1=\"250\" x2=\"345\" y2=\"1950\" stroke-width=\"3\"></line>\n" +
                "        <line x1=\"60\" y1=\"420\" x2=\"2910\" y2=\"420\" stroke-width=\"3\"></line>\n" +
                "        </g>\n" +
                "</svg>";
    }
    public String cie15_3(){

        return "";
    }
    public String cie15_4(){return "";}

    public String test(){
        return timetableRepo.findAll().get(0).getTimetable();
    }
}
