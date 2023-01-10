package com.example.jpa.assignment.assignment09;


import javax.persistence.PostLoad;

public class DatabaseEventListener {

    @PostLoad
    public void postLoad(final Car6 car6) {
        System.out.println(car6.toString());
    }
}
