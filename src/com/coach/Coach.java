package com.coach;

import java.time.LocalDate;

import com.club.Club;
import com.employee.Employee;
import com.player.Player;
import com.player.TransferStatus;
import com.transferManager.TransferManager;

/**
 * Class for creating "Coach" instances
 */
public class Coach extends Employee implements TransferManager{
    private Formation formation;
    private Club club;
    private static int coachCounter;

    /**
     * "Coach" constructor class
     * @param name Coach name
     * @param birthday Coach date of birth
     * @param originCountry Coach country of origin
     * @param formation Coach preferred formation
     * @param club Coach current club
     */
    public Coach(String name, LocalDate birthday, String originCountry, Formation formation, Club club) {
        super(name, birthday, originCountry);
        this.formation = formation;
        this.club = club;
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
     * Getter for Coach preferred formation
     * @return Coach preferred formation
     */
    public Formation getFormation() {
        return formation;
    }

    /**
     * Setter for Coach preferred formation
     * @param formation Coach preferred formation
     */
    public void setFormation(Formation formation) {
        this.formation = formation;
    }

        /**
     * Getter for Coach current club
     * @return Coach current club
     */
    public Club getClub() {
        return club;
    }

    /**
     * Setter for Coach current club
     * @param club Coach current club
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
        return "Coach [name=" + name + ", birthday=" + birthday + ", originCountry=" + originCountry + ", formation="
                + formation + ", club=" + club.getName() + "]";
    }

    /**
     * Method for printing Employee name and type
     */
    public void showInfo(){
        System.out.println("Employee's name is: " + name + ". Their type is: Coach");
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









    /**
     * Interface method for approving transfer by a club's coach
     * @param player player that requested a transfer
     */
    public  void approveTransfer(Player player) {
        if (
            player.getTransferStatus() == TransferStatus.REQUESTED &&
            player.getClub().getName().equals(this.getClub().getName())
        ) {
            player.setTransferStatus(TransferStatus.APPROVED_BY_COACH);
            System.out.println("Transfer of " + player.getName() + " was approved by " + this.getName());
        } else if (player.getTransferStatus() != TransferStatus.REQUESTED) {
            System.out.println("Player " + player.getName() + " haven't requested transfer or was previously rejected");
        } else if (!player.getClub().getName().equals(this.getClub().getName())) {
            System.out.println("Player " + player.getName() + " and coach " + this.getName() + " are from different clubs");
        }
    }

    /**
     * Interface method for rejecting transfer by a club's coach
     * @param player player that requested a transfer
     */
    public  void rejectTransfer(Player player) {
        if (
            player.getTransferStatus() == TransferStatus.REQUESTED &&
            player.getClub().getName().equals(this.getClub().getName())
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
