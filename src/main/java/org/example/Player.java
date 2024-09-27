package org.example;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private int age;
    //anno,goal
    private Map<Integer,Integer> goal;

    public Player(String name, int age, Map<Integer,Integer> goal) {
        this.name = name;
        this.age = age;
        this.goal = goal;
    }

    public Player(){
        this.goal = new HashMap<>();
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
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
                ", age=" + age +
                '}';
    }

    public String printGoal(){
        String res="";
        for (Integer year:goal.keySet()){
            res+=year+":"+goal.get(year)+"\n";
        }
        return res;
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

