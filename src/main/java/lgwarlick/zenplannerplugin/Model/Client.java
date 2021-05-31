package lgwarlick.zenplannerplugin.Model;
import com.opencsv.bean.CsvBindByName;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class Client {

    public Client() {
    }

    public Client(Long id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CsvBindByName(column = "first name", required = true)
    private String firstName;

    @CsvBindByName(column = "last name", required = true)
    private String lastname;

    @CsvBindByName(column = "first attendance", required = true)
    private LocalDate firstAttendance;

    @CsvBindByName
    private LocalDate mostRecentAttendance;


    /*Getters, Setters, toString**/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getFirstAttendance() {
        return firstAttendance;
    }

    public void setFirstAttendance(LocalDate firstAttendance) {
        this.firstAttendance = firstAttendance;
    }

    public LocalDate getMostRecentAttendance() {
        return mostRecentAttendance;
    }

    public void setMostRecentAttendance(LocalDate mostRecentAttendance) {
        this.mostRecentAttendance = mostRecentAttendance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstAttendance=" + firstAttendance +
                ", mostRecentAttendance=" + mostRecentAttendance +
                '}';
    }
}
