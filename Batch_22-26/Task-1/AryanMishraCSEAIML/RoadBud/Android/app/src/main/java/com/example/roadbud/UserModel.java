package com.example.roadbud;

public class UserModel {
    private String name,mob,email;

    public UserModel() {
    }

    public UserModel(String name, String mob, String email) {
        this.name = name;
        this.mob = mob;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
