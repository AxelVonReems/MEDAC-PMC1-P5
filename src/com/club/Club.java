package com.club;

/**
 * Class for creating "Club" instances
 */
public class Club {
    private String name;
    private String abbreviation;

    /**
     * "Club" constructor class
     * @param name - club's name
     * @param abbreviation - club's abbreviation
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
     * toString method for Clubs
     */
    @Override
    public String toString() {
        return "Club [name=" + name + ", abbreviation=" + abbreviation + "]";
    }
}
