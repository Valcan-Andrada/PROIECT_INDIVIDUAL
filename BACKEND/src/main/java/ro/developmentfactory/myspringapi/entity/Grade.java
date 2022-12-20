package ro.developmentfactory.myspringapi.entity;

import javax.persistence.*;
@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @SequenceGenerator(
            name = "grade_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "grade_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private  Long id;

    private int grade;

    public Grade(Long id, int grade1) {
        this.id= id;
        this.grade = grade1;
    }

    public Grade(int grade) {
        this.grade = grade;
    }

    public Grade() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", grade=" + grade +
                '}';
    }
}
