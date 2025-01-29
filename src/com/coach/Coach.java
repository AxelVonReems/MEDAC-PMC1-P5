package com.coach;

import com.club.Club;

/**
 * Class for creating "Coach" instances
 */
public class Coach {
    private String name;
    private Formation formation;
    private Club club;

    /**
     * "Coach" constructor class
     * @param name - coach's name
     * @param formation - coach's preferred formation
     * @param club - coach's current club
     */
    public Coach(String name, Formation formation, Club club) {
        this.name = name;
        this.formation = formation;
        this.club = club;
        if (name.equals("") || name == null) {
            System.out.println("Coach name is required");
        }
        if (formation == null) {
            System.out.println("Formation is required");
        }
        if (club == null) {
            System.out.println("Club is required");
        }
        System.out.println("Coach " + name + " was created.");
    }

    /**
     * Getter for coach's name
     * @return coach's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for coach's name
     * @param name - coach's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for coach's preferred formation
     * @return coach's preferred formation
     */
    public Formation getFormation() {
        return formation;
    }

    /**
     * Setter for coach's preferred formation
     * @param formation - coach's preferred formation
     */
    public void setFormation(Formation formation) {
        this.formation = formation;
    }

        /**
     * Getter for coach's current club
     * @return coach's current club
     */
    public Club getClub() {
        return club;
    }

    /**
     * Setter for coach's current club
     * @param club - coach's current club
     */
    public void setClub(Club club) {
        this.club = club;
    }

    /**
     * toString method for Coaches
     */
    @Override
    public String toString() {
        return "Coach [name=" + name + ", formation=" + formation + ", club=" + club.getName() + "]";
    }

}
