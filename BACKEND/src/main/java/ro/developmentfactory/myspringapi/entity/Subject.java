package ro.developmentfactory.myspringapi.entity;

import javax.persistence.*;
@Entity
@Table(name = "subject")

public class Subject {

    @Id
    @SequenceGenerator(
            name = "subject_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "subject_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column
    private String name;

    @Column
    private int creditNo;

    public Subject(String name, int creditNo) {

        this.name = name;
        this.creditNo = creditNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(int creditNo) {
        this.creditNo = creditNo;
    }

    public Subject(Long id, String name, int creditNo) {
        this.id = id;
        this.name = name;
        this.creditNo = creditNo;
    }

    public Subject() {

    }
}
