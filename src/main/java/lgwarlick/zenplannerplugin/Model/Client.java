package lgwarlick.zenplannerplugin.Model;
import com.opencsv.bean.CsvBindByName;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class Client {

    public Client() {
    }

    public Client(String email, String firstName, String lastname) {
        this.email = email;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;

    @CsvBindByName(column = "first name", required = true)
    private String firstName;

    @CsvBindByName(column = "last name", required = true)
    private String lastname;

    @CsvBindByName(column = "first attendance", required = true)
    private LocalDate firstAttendance;

    @CsvBindByName
    private LocalDate mostRecentAttendance;


    /*Getters, Setters, toString**/

    public String getEmail() {
        return email;
    }

    public void setEmail(String id) {
        this.email = id;
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
                "id=" + email +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstAttendance=" + firstAttendance +
                ", mostRecentAttendance=" + mostRecentAttendance +
                '}';
    }
}
