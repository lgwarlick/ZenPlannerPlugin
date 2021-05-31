package lgwarlick.zenplannerplugin.Model;
import com.opencsv.bean.CsvBindByName;

import java.time.LocalDate;

public class Client {

    public Client() {
    }

    public Client(long id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    private long id;

    @CsvBindByName
    private String firstName;

    @CsvBindByName
    private String lastname;

    @CsvBindByName
    private LocalDate firstAttendance;

    @CsvBindByName
    private LocalDate mostRecentAttendance;

    /*Getters, Setters, toString**/

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
