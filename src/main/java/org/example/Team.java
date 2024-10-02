package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team {
    private String teamName;
    private List<Player> players=new ArrayList<>();;
    private Coach coach; // New field for the coach
    private Map<Integer,Integer> goalConceded=new HashMap<>();;

    public Team(String teamName, List<Player> players, Coach coach, Map<Integer,Integer> goalConceded) {
        setTeamName(teamName);
        setPlayers(players);
        setCoach(coach);
        setGoalConceded(goalConceded);
    }

    // Getter and setter
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getTeamName() {
        return teamName;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void addPlayer(Player player) {
        players.add(player);
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    public Coach getCoach() {
        return coach;
    }

    public void setGoalConceded(Map<Integer, Integer> goal) {
        this.goalConceded = goalConceded;
    }
    public Map<Integer, Integer> getGoalConceded() {
        return goalConceded;
    }

    public int getGoal(int year){
        int res=0;
        for (Player player : players) {
            res+=player.getGoal().get(year);
        }
        return res;
    }

    // A good team in a year is good if score goal respect conceded
    public boolean isAGoodYear(int fromYear){
        return goalConceded.get(fromYear)<getGoal(fromYear);
    }

    public void updateGoalConceded(int year,int goal){
        this.goalConceded.put(year,goal);
    }

    // se per due anni di fila ottiene uno score positivo
    public boolean theCoachIsGood(int year){
        return isAGoodYear(year) && isAGoodYear(year+1);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", players=" + players +
                ", coach=" + coach +
                '}';
    }


}
