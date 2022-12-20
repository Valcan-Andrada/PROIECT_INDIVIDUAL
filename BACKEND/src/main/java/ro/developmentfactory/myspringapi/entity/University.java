package ro.developmentfactory.myspringapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "university")
public class University {
    @Id
    @SequenceGenerator(
            name = "university_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "university_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    private String name;

    public University(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public University(String name) {

        this.name = name;
    }

    public University() {

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

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
