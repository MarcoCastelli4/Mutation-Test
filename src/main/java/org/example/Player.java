package org.example;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private int age;
    //anno,goal
    private Map<Integer,Integer> goal=new HashMap<>();;

    public Player(String name, int age, Map<Integer,Integer> goal) {
       setName(name);
       setAge(age);
       setGoal(goal);
    }

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Map<Integer, Integer> getGoal() {
        return goal;
    }
    public void setGoal(Map<Integer, Integer> goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age + ", goals=" +
                getGoal().toString()+'}';
    }


    public Map<Integer, String> playerDescription() {
        Map<Integer, String> description = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : goal.entrySet()) {
            int year = entry.getKey();
            int goalsScored = entry.getValue();

            if (goalsScored < 5) {
                description.put(year, "bad");
            } else if (goalsScored < 10) {
                description.put(year, "medium");
            } else {
                description.put(year, "bomber");
            }
        }

        return description;
    }
}

