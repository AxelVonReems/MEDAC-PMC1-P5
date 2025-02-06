package com.main;

import java.util.Random;

import com.data.ClubData;
import com.data.CoachData;
import com.data.GroupData;
import com.data.PlayerData;
import com.data.PresidentData;
import com.player.Player;
import com.club.Club;
import com.coach.Coach;
import com.president.President;

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

        // Tests for the Practica 5

        // Testing player transfer

        System.out.println();
        System.out.println("Changing club for Griezmann");
        System.out.println("Current club is " + players.Griezmann.getClub().getName());
        clubs.Atletico_Madrid.playerNamesList();
        clubs.Celta_Vigo.playerNamesList();
        players.Griezmann.playerTransfer(clubs.Celta_Vigo);
        System.out.println("Current club is " + players.Griezmann.getClub().getName());
        clubs.Atletico_Madrid.playerNamesList();
        clubs.Celta_Vigo.playerNamesList();
        System.out.println();

        // Testing ".toString"

        System.out.println("Printing player Barrios:");
        System.out.println(players.Barrios);
        System.out.println();
        System.out.println("Printing coach Ancelotti");
        System.out.println(coaches.Ancelotti);
        System.out.println();
        System.out.println("Printing president Florentino Perez");
        System.out.println(presidents.Florentino_Perez);
        System.out.println();
        System.out.println("Printing club Celta Vigo");
        System.out.println(clubs.Celta_Vigo);
        System.out.println();

        // Complete player transfer simulation of Lewandowski from Barcelona to Real Madrid

        // Random Coach and President decisions
        Random rand = new Random();
        int coachDecision = rand.nextInt(0, 2);
        int presidentDecision = rand.nextInt(0, 2);

        // Transfer requested by Lewandowski
        players.Lewandowski.playerTransferRequest(clubs.Real_Madrid);
        System.out.println(players.Lewandowski.getTransferStatus());

        // Transfer approval by coach
        coaches.Hansi_Flick.transferCoachDecision(players.Lewandowski, coachDecision);
        System.out.println(players.Lewandowski.getTransferStatus());

        // Transfer approval by president
        presidents.Joan_Laporta.transferPresidentDecision(players.Lewandowski, presidentDecision);
        System.out.println(players.Lewandowski.getTransferStatus());

        // Player transfer if approved
        clubs.Real_Madrid.approvedPlayerTransfer(players.Lewandowski);

        // Printing player's current club lineups to verify correct transfer
        System.out.println("Current club of " + players.Lewandowski.getName() + " is " + players.Lewandowski.getClub().getName());
        clubs.Barcelona.playerNamesList();
        clubs.Real_Madrid.playerNamesList();

        // Resetting transfer status for all players that were previously rejected
        clubs.Barcelona.resetTransferStatus();
        clubs.Real_Madrid.resetTransferStatus();
        System.out.println(players.Lewandowski.getTransferStatus());

        // Printing static counter values

        System.out.println("Player instance count is: " + Player.getPlayerCounter());
        System.out.println("Coach instance count is: " + Coach.getCoachCounter());
        System.out.println("President instance count is: " + President.getPresidentCounter());
        System.out.println("Club instance count is: " + Club.getClubCounter());

        // Tests for the Practica 6

        // Printing showInfo for each type of employee

        players.Modric.showInfo();
        coaches.Ancelotti.showInfo();
        presidents.Marian_Mourino_Terrazo.showInfo();

        // Printing sameCounty() method for players from same and different countries

        players.Ter_Stegen.sameCountry(players.Douvikas);
        players.Camello.sameCountry(players.Barrios);

        // Complete player transfer simulation of Lemar from Atlético Madrid to Rayo Vallecano using interface methods

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
    }
}
