package com.example.ezhong.myapplication.model;

/**
 * Created by ezhong on 11/25/16.
 */

public class Attribute {

    public static final int TYPE_TEXT = 0;
    public static final int TYPE_INPUT = 1;

    private String name;
    private int id;
    private int type;
    private String description;

    public Attribute(String name, int id, int type, String description) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
