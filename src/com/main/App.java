package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.data.ClubData;
import com.data.CoachData;
import com.data.PlayerData;
import com.data.PresidentData;
import com.player.Player;
import com.player.TransferStatus;
import com.club.Club;
import com.coach.Coach;
import com.president.President;

/**
 * Main class of the application
 */
public class App {

    public static void main(String[] args) throws Exception {

        // Data creation
        ClubData clubs = new ClubData();
        PlayerData players = new PlayerData(clubs);
        CoachData coaches = new CoachData(clubs);
        PresidentData presidents = new PresidentData(clubs);

        // Adding players to clubs
        ArrayList<Player> playersListBarcelona = new ArrayList<Player>(Arrays.asList(
            players.Ter_Stegen, players.Balde, players.Gavi, players.Fermin, players.Lewandowski
        ));
        clubs.Barcelona.setPlayerList(playersListBarcelona);
        ArrayList<Player> playersListReal_Madrid = new ArrayList<Player>(Arrays.asList(
            players.Courtois, players.Carvajal, players.Modric, players.Camavinga, players.Mbappe
        ));
        clubs.Real_Madrid.setPlayerList(playersListReal_Madrid);
        ArrayList<Player> playersListAtletico_Madrid = new ArrayList<Player>(Arrays.asList(
            players.Oblak, players.Azpilicueta, players.Barrios, players.Lemar, players.Griezmann
        ));
        clubs.Atletico_Madrid.setPlayerList(playersListAtletico_Madrid);
        ArrayList<Player> playersListCelta_Vigo = new ArrayList<Player>(Arrays.asList(
            players.Ivan_Villar, players.Starfelt, players.Hugo_Sotelo, players.Ilaix_Moriba, players.Douvikas
        ));
        clubs.Celta_Vigo.setPlayerList(playersListCelta_Vigo);
        ArrayList<Player> playersListRayo_Vallecano = new ArrayList<Player>(Arrays.asList(
            players.Cardenas, players.Andrei, players.Pedro_Diaz, players.Isi, players.Camello
        ));
        clubs.Rayo_Vallecano.setPlayerList(playersListRayo_Vallecano);

        // Adding coaches to clubs
        clubs.Barcelona.setCoach(coaches.Hansi_Flick);
        clubs.Real_Madrid.setCoach(coaches.Ancelotti);
        clubs.Atletico_Madrid.setCoach(coaches.Simeone);
        clubs.Celta_Vigo.setCoach(coaches.Claudio_Giraldez);
        clubs.Rayo_Vallecano.setCoach(coaches.Iñigo_Perez);

        // Adding presidents to clubs
        clubs.Barcelona.setPresident(presidents.Joan_Laporta);
        clubs.Real_Madrid.setPresident(presidents.Florentino_Perez);
        clubs.Atletico_Madrid.setPresident(presidents.Enrique_Cerezo);
        clubs.Celta_Vigo.setPresident(presidents.Marian_Mourino_Terrazo);
        clubs.Rayo_Vallecano.setPresident(presidents.Raul_Martin_Presa);

        // Testing player transfer
        // UNCOMMENT BEFORE FINAL COMMIT!!!!!
        // System.out.println("Changing club for Griezmann");
        // System.out.println("Current club is " + players.Griezmann.getClub().getName());
        // playerNamesList(clubs.Atletico_Madrid);
        // playerNamesList(clubs.Celta_Vigo);

        // playerTransfer(players.Griezmann, clubs.Celta_Vigo);

        // System.out.println("Current club is " + players.Griezmann.getClub().getName());
        // playerNamesList(clubs.Atletico_Madrid);
        // playerNamesList(clubs.Celta_Vigo);
        // UNCOMMENT BEFORE FINAL COMMIT!!!!!

        // Testing ".toString"

        // UNCOMMENT BEFORE FINAL COMMIT!!!!!
        // System.out.println("Printing player Barrios:");
        // System.out.println(players.Barrios);
        // System.out.println();
        // System.out.println("Printing coach Ancelotti");
        // System.out.println(coaches.Ancelotti);
        // System.out.println();
        // System.out.println("Printing president Florentino Perez");
        // System.out.println(presidents.Florentino_Perez);
        // System.out.println();
        // System.out.println("Printing club Celta Vigo");
        // System.out.println(clubs.Celta_Vigo);
        // System.out.println();
        // UNCOMMENT BEFORE FINAL COMMIT!!!!!

        // Full player transfer simulation

        // Random Coach and President decisions
        Random rand = new Random();
        int coachDecision = rand.nextInt(0, 2);
        int presidentDecision = rand.nextInt(0, 2);

        // Transfer requested by Griezmann
        playerTransferRequest(players.Griezmann, clubs.Celta_Vigo);
        System.out.println(players.Griezmann.getTransferStatus());

        // Transfer approval by coach
        transferCoachDecision(players.Griezmann, coaches.Simeone, coachDecision);
        System.out.println(players.Griezmann.getTransferStatus());

        // Transfer approval by president
        transferPresidentDecision(players.Griezmann, presidents.Enrique_Cerezo, presidentDecision);
        System.out.println(players.Griezmann.getTransferStatus());

        // Player transfer if approved
        approvedPlayerTransfer(players.Griezmann, clubs.Real_Madrid);
        System.out.println("Current club is " + players.Griezmann.getClub().getName());

        // Printing player's current club and club lineups to verify correct transfer
        System.out.println(players.Griezmann.getClub().getName());
        playerNamesList(clubs.Atletico_Madrid);
        playerNamesList(clubs.Real_Madrid);

        // Resetting transfer status for all players that were previously rejected
        resetTransferStatus(clubs.Atletico_Madrid);
        System.out.println(players.Griezmann.getTransferStatus());
    }

    static void playerTransfer(Player player, Club newClub) {
                player.getClub().getPlayerList().remove(player);
                newClub.getPlayerList().add(player);
                player.setClub(newClub);
    }

    static void playerNamesList(Club club) {
        System.out.print("Players list of club " + club.getPlayerList().get(0).getClub().getName() + " :");
        club.getPlayerList().forEach( (n) -> { System.out.print(n.getName() + ", "); } );
        System.out.println();
    }

    static void playerTransferRequest(Player player, Club newClub) {
        if (player.getClub().getName().equals(newClub.getName())) {
            System.out.println("Player " + player.getName() + " already playing for club " + newClub.getName());
        } else {
            player.setTransferStatus(TransferStatus.REQUESTED);
            System.out.println("Player " + player.getName() + " has requested  transfer to club " + newClub.getName());
        }
    }

    static void transferCoachDecision(Player player, Coach coach, int coachDecision) {
        if (
            player.getTransferStatus() == TransferStatus.REQUESTED &&
            player.getClub().getName().equals(coach.getClub().getName()) &&
            coachDecision == 1) {
            player.setTransferStatus(TransferStatus.APPROVED_BY_COACH);
            System.out.println("Transfer of " + player.getName() + " was approved by " + coach.getName());
        } else if (
            player.getTransferStatus() == TransferStatus.REQUESTED &&
            player.getClub().getName().equals(coach.getClub().getName()) &&
            coachDecision == 0
        ) {
            player.setTransferStatus(TransferStatus.REJECTED_BY_COACH);
            System.out.println("Transfer of " + player.getName() + " was rejected by " + coach.getName());
        } else if (player.getTransferStatus() != TransferStatus.REQUESTED) {
            System.out.println("Player " + player.getName() + " haven't requested transfer or was previously rejecter");
        } else if (!player.getClub().getName().equals(coach.getClub().getName())) {
            System.out.println("Player " + player.getName() + " and coach " + coach.getName() + " are from different clubs");
        }
    }

    static void transferPresidentDecision(Player player, President president, int presidentDecision) {
        if (
            player.getTransferStatus() == TransferStatus.APPROVED_BY_COACH &&
            player.getClub().getName().equals(president.getClub().getName()) &&
            presidentDecision == 1) {
            player.setTransferStatus(TransferStatus.APPROVED_BY_PRESIDENT);
            System.out.println("Transfer of " + player.getName() + " was approved by " + president.getName());
        } else if (
            player.getTransferStatus() == TransferStatus.APPROVED_BY_COACH &&
            player.getClub().getName().equals(president.getClub().getName()) &&
            presidentDecision == 0
        ) {
            player.setTransferStatus(TransferStatus.REJECTED_BY_PRESIDENT);
            System.out.println("Transfer of " + player.getName() + " was rejected by " + president.getName());
        } else if (player.getTransferStatus() == TransferStatus.REJECTED_BY_COACH) {
            System.out.println(
                "Transfer of " + player.getName() + " was previously rejected by " + player.getClub().getCoach().getName()
                );
        } else if (!player.getClub().getName().equals(president.getClub().getName())) {
            System.out.println(
                "Player " + player.getName() + " and president " + president.getName() + " are from different clubs"
                );
        }
    }

    static void approvedPlayerTransfer(Player player, Club newClub) {
        if (player.getTransferStatus() == TransferStatus.APPROVED_BY_PRESIDENT) {
            playerTransfer(player, newClub);
            player.setTransferStatus(TransferStatus.WITHOUT_REQUEST);
            System.out.println("Transfer of " + player.getName() + " to " + newClub.getName() + " was approved");
        } else {
            String message = "";
            if (player.getTransferStatus() == TransferStatus.REJECTED_BY_COACH) {
                message = "coach " + player.getClub().getCoach().getName();
            } else if (player.getTransferStatus() == TransferStatus.REJECTED_BY_PRESIDENT) {
                message = "president " + player.getClub().getPresident().getName();
            }
            System.out.println(
                "Transfer of " + player.getName() + " to " + newClub.getName() + " was rejected by " + message
                );
        }
    }

    static void resetTransferStatus(Club club) {
        for (Player player : club.getPlayerList()) {
            if (
                player.getTransferStatus() == TransferStatus.REJECTED_BY_COACH ||
                player.getTransferStatus() == TransferStatus.REJECTED_BY_PRESIDENT
                ) {
                player.setTransferStatus(TransferStatus.WITHOUT_REQUEST);
            }
        }
    }
}
