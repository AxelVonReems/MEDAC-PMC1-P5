package com.coach;

/**
 * Class for creating "Coach" instances
 */
public class Coach {
    private String name;
    private Formation formation;

    /**
     * "Coach" constructor class
     * @param name - coach's name
     * @param formation - coach's preferred formation
     */
    public Coach(String name, Formation formation) {
        this.name = name;
        this.formation = formation;
        if (name.equals("") || name == null) {
            System.out.println("Coach name is required");
        }
        if (formation == null) {
            System.out.println("Formation is required");
        }
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
     * @param name - coach's name
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
     * @param formation - coach's preferred formation
     */
    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    
}
