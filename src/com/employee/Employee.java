package com.employee;

import java.time.LocalDate;

/**
 * Abstract class for creating employees for clubs (players, coaches and presidents)
 */
public abstract class Employee {
    protected String name;
    protected LocalDate birthday;
    protected String originCountry;

    /**
     * Constructor for abstract class Employee
     * @param name Employee name
     * @param birthday Employee date of birth
     * @param originCountry Employee country of origin
     */
    public Employee(String name, LocalDate birthday, String originCountry) {
        this.name = name;
        this.birthday = birthday;
        this.originCountry = originCountry;
        if (name.equals("") || name == null) {
            System.out.println("Name is required");
        }
        if (birthday == null) {
            System.out.println("Birthday is required");
        }
        if (originCountry.equals("")) {
            System.out.println("Country of origin is required");
        }
    }

    /**
     * Getter for Employee name
     * @return Employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Employee name
     * @param name Employee name
     */
    public void setName(String name) {
        this.name = name;
        if (name.equals("") || name == null) {
            System.out.println("Name is required");
        }
    }

    /**
     * Getter for Employee birthday
     * @return Employee birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Setter for Employee birthday
     * @param birthday Employee birthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        if (birthday == null) {
            System.out.println("Birthday is required");
        }
    }

    /**
     * Getter for Employee country of origin
     * @return Employee country of origin
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Setter for Employee country of origin
     * @param originCountry Employee country of origin
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
        if (originCountry.equals("")) {
            System.out.println("Country of origin is required");
        }
    }

    /**
     * toString method for Employee
     */
    @Override
    public String toString() {
        return "Employee [name=" + name + ", birthday=" + birthday + ", originCountry=" + originCountry + "]";
    }

    /**
     * Method for checking if two employees have same country of origin
     * @param employee
     */
    public void sameCountry(Employee employee) {
        if (this.getOriginCountry().equals("") || employee.getOriginCountry().equals("")) {
            System.out.println("One of the employees doesn't have an origin country");
        } else if (this.getOriginCountry().equals(employee.getOriginCountry())) {
            System.out.println(
                this.getName() + " and " + employee.getName() + " are from the same country: " + this.getOriginCountry()
            );
        } else {
            System.out.println(
                this.getName() + " is from " + this.getOriginCountry() + " and " + employee.getName() + "is from " + originCountry
            );
        }
    }

    /**
     * Abstract method for printing employee's name and type
     */
    public abstract void showInfo();

    /**
     * Function that creates date of birth
     * @param day day of birth
     * @param month month of birth
     * @param year year of birth
     * @return date of birth
     */
    public static LocalDate setDate(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, month);
        return date;
    }
}
