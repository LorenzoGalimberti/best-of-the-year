package org.exercises.project.model;

public class Movie {
    // ATTRIBUTI
    private int id;
    private String name;
    // COSTRUTTORE

    public Movie(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Movie() {

    }

    // GES

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
