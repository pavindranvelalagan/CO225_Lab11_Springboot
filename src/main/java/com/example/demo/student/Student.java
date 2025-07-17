package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String Name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {}

    public Student(long id, String Name, String email, LocalDate dob, int age) {
        this.id = id;
        this.Name = Name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String Name, String email, LocalDate dob, int age) {
        this.Name = Name;
        this.email = email;
        this.dob = dob;
        this.age = age;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" + "id=" +id + "name=" + Name + ", email=" + email + ", dob=" + dob + ", age=" + age + '}';
    }
}
