package org.example;

import java.util.Map;

public class Coach {
    private String name;
    private int experience; // Number of years as a coach

    public Coach(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public Coach(){

    }

        // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Getter and Setter for experience
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }

    public String experienceDescription() {
        if (this.experience >= 1 && this.experience < 5)
            return "Experience LOW";
        if (this.experience > 5 && this.experience < 10)
            return "Experience MEDIUM";
        if (this.experience > 10)
            return "Experience HIGH";

        return "Experience NULL";
    }
}
