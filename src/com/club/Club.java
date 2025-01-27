package com.club;

import java.util.ArrayList;

import com.coach.Coach;
import com.player.Player;
import com.president.President;

/**
 * Class for creating "Club" instances
 */
public class Club {
    private String name;
    private String abbreviation;
    private ArrayList<Player> playerList;
    private Coach coach;
    private President president;

    /**
     * "Club" constructor class
     * @param name - club's name
     * @param abbreviation - club's abbreviation
     * @param coach - club's coach
     * @param president - club's president
     */
    public Club(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
        if (name.equals("") || name == null) {
            System.out.println("Club name is required");
        }
        if (abbreviation.equals("") || abbreviation == null) {
            System.out.println("Club abbreviation is required");
        }
    }

    /**
     * Getter for club's name
     * @return club's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for club's name
     * @param name - club's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for club's abbreviation
     * @return club's abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Setter for club's abbreviation
     * @param abbreviation - club's abbreviation
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * Getter for club's player list
     * @return
     */
    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    /**
     * Setter for club's player list
     * @param playerList - club's player list
     */
    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    /**
     * Getter for club's coach
     * @return club's coach
     */
    public Coach getCoach() {
        return coach;
    }

    /**
     * Setter for club's coach
     * @param coach - club's coach
     */
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    /**
     * Getter for club's president
     * @return club's president
     */
    public President getPresident() {
        return president;
    }

    /**
     * Setter for club's president
     * @param president - club's president
     */
    public void setPresident(President president) {
        this.president = president;
    }





    
    /**
     * toString method for Clubs
     */
    @Override
    public String toString() {
        return "Club [name=" + name + ", abbreviation=" + abbreviation + "]";
    }



}
