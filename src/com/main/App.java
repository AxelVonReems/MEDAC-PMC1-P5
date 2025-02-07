package com.main;

import java.util.Random;

import com.data.ClubData;
import com.data.CoachData;
import com.data.GroupData;
import com.data.PlayerData;
import com.data.PresidentData;
import com.employee.Employee;

/**
 * Main class of the application
 */
public class App {

    /**
     * Main class of the application
     * @param args an array of command-line arguments for the application
     */

    public static void main(String[] args) throws Exception {
        // Data creation

        ClubData clubs = new ClubData();
        PlayerData players = new PlayerData(clubs);
        CoachData coaches = new CoachData(clubs);
        PresidentData presidents = new PresidentData(clubs);
        GroupData.ClubCreation(clubs, players, coaches, presidents);
        System.out.println();

        // Printing showInfo for each type of employee

        players.Modric.showInfo();
        coaches.Ancelotti.showInfo();
        presidents.Marian_Mourino_Terrazo.showInfo();
        System.out.println();

        // Printing sameCounty() method for players from same and different countries

        players.Ter_Stegen.sameCountry(players.Douvikas);
        players.Camello.sameCountry(players.Barrios);
        System.out.println();

        // Complete player transfer simulation of Lemar from Atlético Madrid to Rayo Vallecano using interface methods

        // Random Coach and President decisions

        Random rand = new Random();
        int coachDecision = rand.nextInt(0, 2);
        int presidentDecision = rand.nextInt(0, 2);

        // Transfer requested by Lemar
        players.Lemar.playerTransferRequest(clubs.Rayo_Vallecano);
        System.out.println(players.Lemar.getTransferStatus());

        // Transfer approval or rejection by coach
        if (coachDecision == 1) {
            coaches.Simeone.approveTransfer(players.Lemar);;
        } else if (coachDecision == 0) {
            coaches.Simeone.rejectTransfer(players.Lemar);
        }
        System.out.println(players.Lemar.getTransferStatus());

        // Transfer approval or rejection by president
        if (presidentDecision == 1) {
            presidents.Enrique_Cerezo.approveTransfer(players.Lemar);;
        } else if (presidentDecision == 0) {
            presidents.Enrique_Cerezo.rejectTransfer(players.Lemar);
        }
        System.out.println(players.Lemar.getTransferStatus());

        // Player transfer if approved
        clubs.Rayo_Vallecano.approvedPlayerTransfer(players.Lemar);

        // Printing player's current club and club lineups to verify correct transfer
        System.out.println("Current club of " + players.Lemar.getName() + " is " + players.Lemar.getClub().getName());
        clubs.Atletico_Madrid.playerNamesList();
        clubs.Rayo_Vallecano.playerNamesList();

        // Printing static counter values
        System.out.println("Employee instance count is: " + Employee.getEmployeeCounter());
    }
}
