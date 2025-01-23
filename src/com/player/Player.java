package com.player;

import java.sql.Date;

/**
 * Class for creating "Player" instances
 */
public class Player {
    private String name;
    private Date birthday;
    private String originCountry;
    private Position position;
    private int squadNumber;
    private TransferStatus transferStatus;

    /**
     * "Player" constructor class
     * @param name - player's name
     * @param birthday - player's date of birth
     * @param originCountry - player's country of origin
     * @param position - player's preferred position
     * @param squadNumber - player's squad number
     * @param transferStatus - player's transfer status
     */
    public Player(
        String name,
        Date birthday,
        String originCountry,
        Position position,
        int squadNumber,
        TransferStatus transferStatus
    ) {
        this.name = name;
        this.birthday = birthday;
        this.originCountry = originCountry;
        this.position = position;
        this.squadNumber = squadNumber;
        this.transferStatus = transferStatus;
        if (name.equals("") || name == null) {
            System.out.println("Player name is required");
        }
        if (birthday == null) {
            System.out.println("Birthday is required");
        }
        if (originCountry.equals("")) {
            System.out.println("Country of origin is required");
        }
        if (position == null) {
            System.out.println("Position is required");
        }
        if (squadNumber < 0) {
            System.out.println("Squad number can't be less than zero");
        }
        if (transferStatus == null) {
            System.out.println("Transfer status is required");
        }
        System.out.println("Player " + name + " was created.");
    }

/**
 * Getter for player name
 * @return
 */
    public String getName() {
        return name;
    }

/**
 * Setter for player name
 * @param name
 */
    public void setName(String name) {
        this.name = name;
    }

/**
 * Getter for player's birthday
 * @return
 */
    public Date getBirthday() {
        return birthday;
    }

/**
 * Setter for player's birthday
 * @param birthday
 */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

/**
 * Getter for player's country of origin
 * @return
 */
    public String getOriginCountry() {
        return originCountry;
    }

/**
 * Setter for player's country of origin
 * @param originCountry
 */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

/**
 * Getter for player's position
 * @return
 */
    public Position getPosition() {
        return position;
    }

/**
 * Setter for player's position
 * @param position
 */
    public void setPosition(Position position) {
        this.position = position;
    }

/**
 * Getter for player's squad number
 * @return
 */
    public int getSquadNumber() {
        return squadNumber;
    }

/**
 * Setter for player's squad number
 * @param squadNumber
 */
    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }

/**
 * Getter for player's transfer status
 * @return
 */
    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

/**
 * Setter for player's transfer status
 * @param transferStatus
 */
    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }

    
}
