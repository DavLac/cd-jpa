package com.example.jpa.solution.assignment02.onetomany;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false, foreignKey=@ForeignKey(name = "Fk_school")) // owning side
    private School school;
}
