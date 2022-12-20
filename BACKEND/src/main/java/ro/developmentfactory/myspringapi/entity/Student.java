package ro.developmentfactory.myspringapi.entity;

import javax.persistence.*;

@Entity
@Table(name= "student")
public class Student {


    @Id
    @SequenceGenerator(
            name = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "student_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    public Student(Long id, String CNP, String dateOfBirth,  String department, int group, String name, int year,String email, String password) {
        this.id=id;
        this.CNP = CNP;
        this.dateOfBirth = dateOfBirth;
        this.year = year;
        this.department = department;
        this.grup = group;
        this.name = name;
        this.email = email;
        this.password = password;

    }

    public Student(String CNP, String dateOfBirth,  String department, int group, String name, int year,String email, String password) {

        this.CNP = CNP;
        this.dateOfBirth = dateOfBirth;
        this.year = year;
        this.department = department;
        this.grup = group;
        this.name = name;
        this.email = email;
        this.password = password;

    }

    public String getCNP() {
        return this.CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getGroup() {
        return grup;
    }

    public void setGroup(int group) {
        this.grup = group;
    }

    @Column
    private String CNP;
@Column
    private String dateOfBirth;

@Column

    private String department;
@Column
    private int grup;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private int year;

    public Student( String name, String email, String password, int year) {

        this.name = name;
        this.email = email;
        this.password = password;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public Student(String email,String password) {
        this.email = email;
        this.password = password;
    }

    public int getGrup() {
        return grup;
    }

    public void setGrup(int grup) {
        this.grup = grup;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public Student() {

    }
}
