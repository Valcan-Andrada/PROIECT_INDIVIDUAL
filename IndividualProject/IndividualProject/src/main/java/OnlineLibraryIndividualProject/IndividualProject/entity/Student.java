package OnlineLibraryIndividualProject.IndividualProject.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "student_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    @Column
    private String name;
    @Column
    private int year;
    @Column
    private String specilisation;
    @Column
    private  String email;
    @Column
    private String password;

    public Student(){}

    public Student(String name, int year, String specilisation, String email, String password) {
        this.name = name;
        this.year = year;
        this.specilisation = specilisation;
        this.email = email;
        this.password = password;
    }

    public Student(Long id, String name, int year, String specilisation, String email, String password) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.specilisation = specilisation;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSpecilisation() {
        return specilisation;
    }

    public void setSpecilisation(String specilisation) {
        this.specilisation = specilisation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
