package com.Allen;

import java.util.stream.Stream;

public class Player extends Member {

    private String position;
    private String team;
    private int points;
    private int goals;


    public Player(String position, String team, int points, int goals) {
        this.position = position;
        this.team = team;
        this.points = points;
        this.goals = goals;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
