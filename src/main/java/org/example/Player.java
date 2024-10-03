package org.example;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private int age;
    //anno,goal
    private Map<Integer,Integer> goal;

    private static final int BAD_PLAYER=5;
    private static final int MEDIUM_PLAYER=10;
    private static final int BOMBER_PLAYER=20;

    public Player(String name, int age, Map<Integer,Integer> goal) {
       setName(name);
       setAge(age);
       setGoal(goal);
    }

    public Player(){goal=new HashMap<>();}
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

    public Map<Integer, Integer> getMoneyBonus() {
        Map<Integer, Integer> moneyBonus = new HashMap<>();

        for (Map.Entry<Integer, String> entry : this.playerDescription().entrySet()) {
            switch (entry.getValue()) {
                case "bad":
                    moneyBonus.put(entry.getKey(), BAD_PLAYER * 1);
                    break;
                case "medium":
                    moneyBonus.put(entry.getKey(), MEDIUM_PLAYER * 5);
                    break;
                case "bomber":
                    moneyBonus.put(entry.getKey(), BOMBER_PLAYER * 10);
                    break;
                default:
                    // Handle cases where entry.getValue() is not "bad", "medium", or "bomber"
                    break;
            }
        }

        return moneyBonus;
    }

}

