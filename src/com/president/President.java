package com.president;

import java.time.LocalDate;

import com.club.Club;
import com.employee.Employee;
import com.player.Player;
import com.player.TransferStatus;

/**
 * Class for creating "President" instances
 */
public class President extends Employee{
    private String dni;
    private Club club;
    private static int presidentCounter;

    /**
     * "President" constructor class
     * @param dni President DNI
     * @param name President name
     * @param club President current club
     */
    public President(String dni, String name, LocalDate birthday, String originCountry, Club club) {
        super(name, birthday, originCountry);
        this.dni = dni;
        this.club = club;
        if (dni.equals("") || dni == null) {
            System.out.println("President DNI is required");
        }
        if (name.equals("") || name == null) {
            System.out.println("President name is required");
        }
        if (club == null) {
            System.out.println("President club is required");
        }
        System.out.println("President " + name + " was created.");
        presidentCounter += 1;
    }

    /**
     * Getter for President DNI
     * @return President DNI
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter for President DNI
     * @param dni President DNI
     */
    public void setDni(String dni) {
        this.dni = dni;
        if (dni.equals("") || dni == null) {
            System.out.println("President DNI is required");
        }
    }

    /**
     * Getter for President current club
     * @return President current club
     */
    public Club getClub() {
        return club;
    }

    /**
     * Setter for President current club
     * @param club President name
     */
    public void setClub(Club club) {
        this.club = club;
    }

    /**
     * Getter for counter for created President instances
     * @return counter for created President instances
     */
    public static int getPresidentCounter() {
        return presidentCounter;
    }

    /**
     * Setter for counter for created President instances
     * @param presidentCounter counter for created President instances
     */
    public static void setPresidentCounter(int presidentCounter) {
        President.presidentCounter = presidentCounter;
    }

    /**
     * toString method for Presidents
     */
    @Override
    public String toString() {
        return "President [name=" + name + ", birthday=" + birthday + ", originCountry=" + originCountry + ", dni="
                + dni + ", club=" + club + "]";
    }

    /**
     * Method for printing Employee name and type
     */
    public void showInfo(){
        System.out.println("Employee's name is: " + name + ". Their type is: President");
    }

    /**
     * Method for transfer decision by a club's president
     * @param player player that requested a transfer
     * @param presidentDecision president's decision: 0 - reject, 1 - approve
     */
    public void transferPresidentDecision(Player player, int presidentDecision) {
        if (
            player.getTransferStatus() == TransferStatus.APPROVED_BY_COACH &&
            player.getClub().getName().equals(this.getClub().getName()) &&
            presidentDecision == 1) {
            player.setTransferStatus(TransferStatus.APPROVED_BY_PRESIDENT);
            System.out.println("Transfer of " + player.getName() + " was approved by " + this.getName());
        } else if (
            player.getTransferStatus() == TransferStatus.APPROVED_BY_COACH &&
            player.getClub().getName().equals(this.getClub().getName()) &&
            presidentDecision == 0
        ) {
            player.setTransferStatus(TransferStatus.REJECTED_BY_PRESIDENT);
            System.out.println("Transfer of " + player.getName() + " was rejected by " + this.getName());
        } else if (player.getTransferStatus() == TransferStatus.REJECTED_BY_COACH) {
            System.out.println(
                "Transfer of " + player.getName() + " was previously rejected by " + player.getClub().getCoach().getName()
                );
        } else if (player.getTransferStatus() != TransferStatus.REJECTED_BY_PRESIDENT) {
            System.out.println("Player " + player.getName() + " haven't requested transfer or was previously rejected");
        } else if (!player.getClub().getName().equals(this.getClub().getName())) {
            System.out.println(
                "Player " + player.getName() + " and president " + this.getName() + " are from different clubs"
                );
        }
    }
}
