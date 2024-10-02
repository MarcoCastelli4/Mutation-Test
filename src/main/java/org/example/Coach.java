package org.example;

public class Coach {
    private String name;
    private int yearOfExperience; // Number of years as a coach

    public Coach(String name, int experience) {
        setName(name);
        setYearOfExperience(experience);
    }

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }
    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", experience=" + yearOfExperience +
                '}';
    }

    public String experienceDescription() {
        if (this.yearOfExperience >= 1 && this.yearOfExperience < 5)
            return "Experience LOW";
        if (this.yearOfExperience >= 5 && this.yearOfExperience < 10)
            return "Experience MEDIUM";
        if (this.yearOfExperience >= 10)
            return "Experience HIGH";

        return "No Experience";
    }
}
