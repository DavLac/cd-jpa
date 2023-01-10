package com.example.jpa.solution.assignment10.demo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


public class MyUser {
    @NotNull(message = "Id cannot be null")
    private Long id;
    @Size(min = 2, max = 75, message = "Name should be between 2 and 75 characters")
    private String name;
    private List<@NotBlank String> notes; // validations can also be applied on elements of a collection

    public MyUser(Long id, String name, List<@NotBlank String> notes) {
        this.id = id;
        this.name = name;
        this.notes = notes;
    }

    public MyUser() {
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

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }
}
