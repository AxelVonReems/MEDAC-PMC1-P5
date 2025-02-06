package com.player;

import java.time.LocalDate;

import com.club.Club;
import com.employee.Employee;

/**
 * Class for creating "Player" instances
 */
public class Player extends Employee{
    private Position position;
    private int squadNumber;
    private TransferStatus transferStatus;
    private Club club;
    private static int playerCounter;

    /**
     * "Player" constructor class
     * @param name Player name
     * @param birthday Player date of birth
     * @param originCountry Player country of origin
     * @param position Player preferred position
     * @param squadNumber Player squad number
     * @param transferStatus Player transfer status
     * @param club Player current club
     */
    public Player(
        String name,
        LocalDate birthday,
        String originCountry,
        Position position,
        int squadNumber,
        TransferStatus transferStatus,
        Club club
    ) {
        super(name, birthday, originCountry);
        this.position = position;
        this.squadNumber = squadNumber;
        this.transferStatus = transferStatus;
        this.club = club;
        if (position == null) {
            System.out.println("Position is required");
        }
        if (squadNumber < 0) {
            System.out.println("Squad number can't be less than zero");
        }
        if (transferStatus == null) {
            System.out.println("Transfer status is required");
        }
        if (club == null) {
            System.out.println("Club is required");
        }
        System.out.println("Player " + name + " was created.");
        playerCounter += 1;
    }

    /**
     * Getter for Player name
     * @return Player name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Player name
     * @param name Player name
     */
    public void setName(String name) {
        this.name = name;
        if (name.equals("") || name == null) {
            System.out.println("Player name is required");
        }
    }

    /**
     * Getter for Player birthday
     * @return Player birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Setter for Player birthday
     * @param birthday Player birthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        if (birthday == null) {
            System.out.println("Birthday is required");
        }
    }

    /**
     * Getter for Player country of origin
     * @return Player country of origin
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Setter for Player country of origin
     * @param originCountry Player country of origin
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
        if (originCountry.equals("")) {
            System.out.println("Country of origin is required");
        }
    }

    /**
     * Getter for Player position
     * @return Player position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Setter for Player position
     * @param position Player position
     */
    public void setPosition(Position position) {
        this.position = position;
        if (position == null) {
            System.out.println("Position is required");
        }
    }

    /**
     * Getter for Player squad number
     * @return Player squad number
     */
    public int getSquadNumber() {
        return squadNumber;
    }

    /**
     * Setter for Player squad number
     * @param squadNumber Player squad number
     */
    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
        if (squadNumber < 0) {
            System.out.println("Squad number can't be less than zero");
        }
    }

    /**
     * Getter for Player transfer status
     * @return Player transfer status
     */
    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    /**
     * Setter for Player transfer status
     * @param transferStatus Player transfer status
     */
    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
        if (transferStatus == null) {
            System.out.println("Transfer status is required");
        }
    }

    /**
     * Getter for Player current club
     * @return Player current club
     */
    public Club getClub() {
        return club;
    }

    
    /**
     * Setter for Player current club
     * @param club Player current club
     */
    public void setClub(Club club) {
        this.club = club;
    }

    /**
     * toString method for Players
     */
    @Override
    public String toString() {
        return "Player [name=" + name + ", birthday=" + birthday + ", originCountry=" + originCountry + ", position=" +
        position + ", squadNumber=" + squadNumber + ", transferStatus=" + transferStatus + ", club=" + club.getName() + "]";
    }

        /**
     * Method for printing Employee name and type
     */
    public void showInfo(){
        System.out.println("Employee's name is: " + name + ". Their type is: President");
    }

    /**
     * Getter for counter for created Player instances
     * @return counter for created Player instances
     */
    public static int getPlayerCounter() {
        return playerCounter;
    }

    /**
     * Setter for counter for created Player instances
     * @param playerCounter counter for created Player instances
     */
    public static void setPlayerCounter(int playerCounter) {
        Player.playerCounter = playerCounter;
    }

    /**
     * Method for player transfer without confirmation
     * @param newClub club, to which player will pe transfered
     */
    public void playerTransfer(Club newClub) {
        this.getClub().getPlayerList().remove(this);
        newClub.getPlayerList().add(this);
        this.setClub(newClub);
    }

    /**
     * Method to request player transfer
     * @param newClub club, to which player will pe transfered
     */
    public void playerTransferRequest(Club newClub) {
        if (this.getClub().getName().equals(newClub.getName())) {
            System.out.println("Player " + this.getName() + " already playing for club " + newClub.getName());
        } else if (
            this.getTransferStatus() == TransferStatus.REJECTED_BY_COACH ||
            this.getTransferStatus() == TransferStatus.REJECTED_BY_PRESIDENT) {
            System.out.println("Transfer of " + this.getName() + " was already rejected previously");
        } else {
            this.setTransferStatus(TransferStatus.REQUESTED);
            System.out.println("Player " + this.getName() + " has requested transfer to club " + newClub.getName());
        }
    }
}
