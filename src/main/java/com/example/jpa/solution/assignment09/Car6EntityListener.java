package com.example.jpa.solution.assignment09;

import javax.persistence.PostLoad;

public class Car6EntityListener {
    @PostLoad
    public void postLoad(final Car6 car6) {
        System.out.println("Retrieving " + car6.toString());
    }
}
