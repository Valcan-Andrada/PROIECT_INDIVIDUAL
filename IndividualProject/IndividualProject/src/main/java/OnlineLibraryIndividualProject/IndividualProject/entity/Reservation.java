package OnlineLibraryIndividualProject.IndividualProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @SequenceGenerator(
            name = "reservation_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "reservation_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    @Column
    private Long student;
    @Column
    private Long book;

    public Reservation(){}

    public Reservation(Long studentId, Long bookId) {

        this.student = studentId;
        book = bookId;
    }

    public Reservation(Long id, Long studentId, Long bookId) {
        this.id = id;
        this.student = studentId;
        book = bookId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudent() {
        return student;
    }

    public void setStudent(Long studentId) {
        this.student = studentId;
    }

    public Long getBook() {
        return book;
    }

    public void setBook(Long bookId) {
        book = bookId;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", student=" + student +
                ", book=" + book +
                '}';
    }
}
