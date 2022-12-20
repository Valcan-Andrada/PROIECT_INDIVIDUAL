package ro.developmentfactory.myspringapi.entity;

import javax.persistence.*;
@Entity
@Table(name = "specialization")
public class Specialization {

    @Id
    @SequenceGenerator(
            name = "specialization_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "specialization_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column
    private String Name;

    public Specialization(String name) {
        Name = name;
    }

    public Specialization() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
