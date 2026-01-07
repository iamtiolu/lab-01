package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date Birthdate;

    public Pet(String name) {
        this.name = name;
        this.Birthdate = new Date();
    }

    public Pet(String name, Date Birthdate) {
        this.name = name;
        this.Birthdate = Birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public abstract String speak();
}
