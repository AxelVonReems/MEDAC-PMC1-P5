package com.coach;

import com.club.Club;
import com.player.Player;
import com.player.TransferStatus;

/**
 * Class for creating "Coach" instances
 */
public class Coach {
    private String name;
    private Formation formation;
    private Club club;
    private static int coachCounter;

    /**
     * "Coach" constructor class
     * @param name coach's name
     * @param formation coach's preferred formation
     * @param club coach's current club
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
        coachCounter += 1;
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
     * @param name coach's name
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
     * @param formation coach's preferred formation
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
     * @param club coach's current club
     */
    public void setClub(Club club) {
        this.club = club;
    }

    /**
     * Getter for counter for created Coach instances
     * @return counter for created Coach instances
     */
    public static int getCoachCounter() {
        return coachCounter;
    }

    /**
     * Setter for counter for created Coach instances
     * @param coachCounter counter for created Coach instances
     */
    public static void setCoachCounter(int coachCounter) {
        Coach.coachCounter = coachCounter;
    }

    /**
     * toString method for Coaches
     */
    @Override
    public String toString() {
        return "Coach [name=" + name + ", formation=" + formation + ", club=" + club.getName() + "]";
    }

    /**
     * Method for transfer decision by a club's coach
     * @param player player that requested a transfer
     * @param coachDecision coach's decision: 0 - reject, 1 - approve
     */
    public  void transferCoachDecision(Player player, int coachDecision) {
        if (
            player.getTransferStatus() == TransferStatus.REQUESTED &&
            player.getClub().getName().equals(this.getClub().getName()) &&
            coachDecision == 1) {
            player.setTransferStatus(TransferStatus.APPROVED_BY_COACH);
            System.out.println("Transfer of " + player.getName() + " was approved by " + this.getName());
        } else if (
            player.getTransferStatus() == TransferStatus.REQUESTED &&
            player.getClub().getName().equals(this.getClub().getName()) &&
            coachDecision == 0
        ) {
            player.setTransferStatus(TransferStatus.REJECTED_BY_COACH);
            System.out.println("Transfer of " + player.getName() + " was rejected by " + this.getName());
        } else if (player.getTransferStatus() != TransferStatus.REQUESTED) {
            System.out.println("Player " + player.getName() + " haven't requested transfer or was previously rejected");
        } else if (!player.getClub().getName().equals(this.getClub().getName())) {
            System.out.println("Player " + player.getName() + " and coach " + this.getName() + " are from different clubs");
        }
    }
}
