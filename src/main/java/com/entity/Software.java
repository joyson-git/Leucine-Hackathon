package com.entity;



public class Software {
    private int id;
    private String name;
    private String description;
    private String accessLevels;

    // Constructor
    public Software(int id, String name, String description, String accessLevels) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevels = accessLevels;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAccessLevels() {
        return accessLevels;
    }
}

