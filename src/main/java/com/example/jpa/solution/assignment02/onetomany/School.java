package com.example.jpa.solution.assignment02.onetomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "school")
    private List<Student> studentList = new ArrayList<>();
}
