package org.example;

import java.util.HashMap;
import java.util.Map;


public class Player {
    private String name;
    private int age;
    //anno,goal
    private Map<Integer,Integer> goal;
    private final Map<Integer,Integer> moneyBonus=new HashMap<>();

    private static final int BAD_PLAYER=5;
    private static final int MEDIUM_PLAYER=10;
    private static final int BOMBER_PLAYER=20;

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

            if (goalsScored < BAD_PLAYER) {
                description.put(year, "bad");
            } else if (goalsScored < MEDIUM_PLAYER) {
                description.put(year, "medium");
            } else {
                description.put(year, "bomber");
            }
        }
        return description;
    }

    public void setMoneyBonus(){
        for (Map.Entry<Integer, String> entry: this.playerDescription().entrySet()) {

            if(entry.getValue()=="bad")
                moneyBonus.put(entry.getKey(), BAD_PLAYER*1);
            if(entry.getValue()=="medium")
                moneyBonus.put(entry.getKey(), MEDIUM_PLAYER*5);
            if(entry.getValue()=="bomber")
                moneyBonus.put(entry.getKey(), BOMBER_PLAYER*10);
        }
    }

    public Map<Integer, Integer> getMoneyBonus() {
        return moneyBonus;
    }
}

