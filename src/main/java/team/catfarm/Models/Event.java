package team.catfarm.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private String color;

    //for repeated events:
//    private int repeatInterval;
//    private String repeatPattern; //day, week, month, year
//    private String repetitionEndType; //indefinite, repetitionEndDate, repetitionEndOccurrences
//    private Date repetitionEndDate;
//    private int repetitionEndOccurrences;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<Task> tasks;

    @OneToMany(mappedBy = "event")
    @JsonIgnore
    private List<File> files;
}
