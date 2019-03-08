package bbro.iut_book_v01.timetable;

import bbro.iut_book_v01.group.Group_;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class Timetable {
    @Id
    @GeneratedValue
    private long timetableId;

    @ManyToOne
    private Group_ group;
    @Column(nullable = false)
    private String timetable;

    private Blob file;

    public Timetable() {
    }

    public Timetable(Group_ group, String timetable) {
        this.group = group;
        this.timetable = timetable;
    }

    public long getTimetableId() {
        return timetableId;
    }

    public void setTimetableId(long timetableId) {
        this.timetableId = timetableId;
    }

    public Group_ getGroup() {
        return group;
    }

    public void setGroup(Group_ group) {
        this.group = group;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    public Blob getFile() {
        return file;
    }

    public void setFile(Blob file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "timetableId=" + timetableId +
                ", group=" + group +
                ", timetable='" + timetable + '\'' +
                '}';
    }
}
