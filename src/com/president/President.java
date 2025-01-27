package com.president;

/**
 * Class for creating "President" instances
 */
public class President {
    private String dni;
    private String name;

    /**
     * "President" constructor class
     * @param dni - president's DNI
     * @param name - president's name
     */
    public President(String dni, String name) {
        this.dni = dni;
        this.name = name;
        if (dni.equals("") || dni == null) {
            System.out.println("President DNI is required");
        }
        if (name.equals("") || name == null) {
            System.out.println("President name is required");
        }
        System.out.println("President " + name + " was created.");
    }

    /**
     * Getter for president's DNI
     * @return president's DNI
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter for president's DNI
     * @param dni - president's DNI
     */
    public void setDni(String dni) {
        this.dni = dni;
        if (dni.equals("") || dni == null) {
            System.out.println("President DNI is required");
        }
    }

    /**
     * Getter for president's name
     * @return president's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for president's name
     * @param name - president's name
     */
    public void setName(String name) {
        this.name = name;
        if (name.equals("") || name == null) {
            System.out.println("President name is required");
        }
    }

    @Override
    public String toString() {
        return "President [dni=" + dni + ", name=" + name + "]";
    }
}
