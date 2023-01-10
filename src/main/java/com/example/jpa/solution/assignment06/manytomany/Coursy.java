package com.example.jpa.solution.assignment06.manytomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Coursy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "coursy_studentys",
            joinColumns = @JoinColumn(name = "coursy_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "studenty_id", referencedColumnName = "id"))
    private List<Studenty> studentys = new ArrayList<>();
}
