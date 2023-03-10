package OnlineLibraryIndividualProject.IndividualProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "book_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private int amount;

    public Book(){}

    public Book( String title, String author, int amount) {
        this.title = title;
        this.author = author;
        this.amount = amount;
    }

    public Book(Long id, String title, String author, int amount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
