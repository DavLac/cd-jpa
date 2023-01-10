package com.example.jpa.solution.assignment06.manytomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Studenty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "studentys")
    private List<Coursy> coursys = new ArrayList<>();
}
