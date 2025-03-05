package com.president;

import java.time.LocalDate;

import com.club.Club;
import com.employee.Employee;
import com.player.Player;
import com.player.TransferStatus;
import com.transferManager.TransferManager;

/**
 * Class for creating "President" instances
 */
public class President extends Employee implements TransferManager{
    private String dni;
    private Club club;
    private static int presidentCounter;

    /**
     * "President" constructor class
     * @param dni President DNI
     * @param name President name
     * @param birthday President date of birth
     * @param originCountry President country of origin
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
                + dni + ", club=" + club.getName() + "]";
    }

    /**
     * Method for printing Employee name and type
     */
    public void showInfo(){
        System.out.println("Employee's name is: " + name + ". Their type is: " + this.getClass().getSimpleName());
    }

    /**
     * Interface method for approving transfer by a club's president
     * @param player player that requested a transfer
     */
    public void approveTransfer(Player player) {
        if (
            player.getTransferStatus() == TransferStatus.APPROVED_BY_COACH &&
            player.getClub().getName().equals(this.getClub().getName())
        ) {
            player.setTransferStatus(TransferStatus.APPROVED_BY_PRESIDENT);
            System.out.println("Transfer of " + player.getName() + " was approved by " + this.getName());
        } else if (player.getTransferStatus() == TransferStatus.REJECTED_BY_COACH) {
            System.out.println(
                "Transfer of " + player.getName() + " was previously rejected by " + player.getClub().getCoach().getName()
                );
        } else if (!player.getClub().getName().equals(this.getClub().getName())) {
            System.out.println(
                "Player " + player.getName() + " and president " + this.getName() + " are from different clubs"
                );
        }
    }

    /**
     * Interface method for rejecting transfer by a club's president
     * @param player player that requested a transfer
     */
    public void rejectTransfer(Player player) {
        if (
            player.getTransferStatus() == TransferStatus.APPROVED_BY_COACH &&
            player.getClub().getName().equals(this.getClub().getName())
        ) {
            player.setTransferStatus(TransferStatus.REJECTED_BY_PRESIDENT);
            System.out.println("Transfer of " + player.getName() + " was rejected by " + this.getName());
        } else if (player.getTransferStatus() == TransferStatus.REJECTED_BY_COACH) {
            System.out.println(
                "Transfer of " + player.getName() + " was previously rejected by " + player.getClub().getCoach().getName()
                );
        } else if (!player.getClub().getName().equals(this.getClub().getName())) {
            System.out.println(
                "Player " + player.getName() + " and president " + this.getName() + " are from different clubs"
                );
        }
    }
}
