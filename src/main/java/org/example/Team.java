package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team {
    private String teamName;
    private List<Player> players;
    private Coach coach; // New field for the coach
    private Map<Integer,Integer> goalConceded;

    public Team(String teamName, List<Player> players, Coach coach, Map<Integer,Integer> goalConceded) {
        this.teamName = teamName;
        this.players = players;
        this.coach=coach;
        this.goalConceded = goalConceded;
    }

    public Team(){
        this.players=new ArrayList<>();
        this.goalConceded=new HashMap<>();
        this.teamName="";
        this.coach=null;
    }

    // Method to assign a coach to the team
    public void assignCoach(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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

    public Map<Integer, Integer> getGoalConceded() {
        return goalConceded;
    }

    public void setGoalConceded(Map<Integer, Integer> goal) {
        this.goalConceded = goalConceded;
    }

    public void updateGoalConceded(int year,int goal){
        this.goalConceded.put(year,goal);
    }

    // se per due anni di fila ottiene uno score positivo
    public boolean theCoachIsGood(int year){
        return isAGoodYear(year) && isAGoodYear(year+1);
    }

    // New method to get the total number of players in the team
    public int getTotalPlayers() {
        return players.size();
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
