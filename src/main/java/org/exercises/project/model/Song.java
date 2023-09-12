package org.exercises.project.model;

public class Song {
    //ATTR
    private int id;
    private String name;
    // COSTRUTTORE


    public Song(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Song() {

    }

    // G & S

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
