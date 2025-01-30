package com.club;

import java.util.ArrayList;

import com.coach.Coach;
import com.player.Player;
import com.player.TransferStatus;
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
    private static int clubCounter;

    /**
     * "Club" constructor class
     * @param name - club's name
     * @param abbreviation - club's abbreviation
     * @param coach - club's coach
     * @param president - club's president
     * @param clubCounter - counter for created Club instances
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
        clubCounter += 1;
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
     * @return club's player list
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
     * Getter for counter for created Club instances
     * @return counter for created Club instances
     */
    public static int getClubCounter() {
        return clubCounter;
    }

    /**
     *  Setter for counter for created Club instances
     * @param clubCounter - counter for created Club instances
     */
    public static void setClubCounter(int clubCounter) {
        Club.clubCounter = clubCounter;
    }

    /**
     * toString method for Clubs
     */
    @Override
    public String toString() {
        return "Club [name=" + name + ", abbreviation=" + abbreviation + ", playerList=" + playerList + ", coach="
                + coach + ", president=" + president + "]";
    }

    /**
     * Method for printing players list for a Club instance
     */
    public void playerNamesList() {
        System.out.print("Players list of club " + this.getPlayerList().get(0).getClub().getName() + " :");
        this.getPlayerList().forEach( (n) -> { System.out.print(n.getName() + ", "); } );
        System.out.println();
    }

    /**
     * Method for processing fully approved player transfer
     * @param player - player approved for transfer
     */
    public void approvedPlayerTransfer(Player player) {
        if (player.getTransferStatus() == TransferStatus.APPROVED_BY_PRESIDENT) {
            player.playerTransfer(this);
            player.setTransferStatus(TransferStatus.WITHOUT_REQUEST);
            System.out.println("Transfer of " + player.getName() + " to " + this.getName() + " was approved");
        } else {
            String message = "";
            if (player.getTransferStatus() == TransferStatus.REJECTED_BY_COACH) {
                message = "rejected by coach " + player.getClub().getCoach().getName();
            } else if (player.getTransferStatus() == TransferStatus.REJECTED_BY_PRESIDENT) {
                message = "rejected by president " + player.getClub().getPresident().getName();
            } else {
                message = "previously rejected or wasn't requested";
            }
            System.out.println(
                "Transfer of " + player.getName() + " to " + this.getName() + " was " + message
                );
        }
    }

    /**
     * Method to reset transfer status for club's players that previously were rejected for transfer
     */
    public void resetTransferStatus() {
        for (Player player : this.getPlayerList()) {
            if (
                player.getTransferStatus() == TransferStatus.REJECTED_BY_COACH ||
                player.getTransferStatus() == TransferStatus.REJECTED_BY_PRESIDENT
                ) {
                player.setTransferStatus(TransferStatus.WITHOUT_REQUEST);
            }
        }
    }
}
