package com.main;

import java.util.ArrayList;
import java.util.Arrays;

import com.data.ClubData;
import com.data.CoachData;
import com.data.PlayerData;
import com.data.PresidentData;
import com.player.Player;
import com.club.Club;

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
        // System.out.println("Changing club for Barrios");
        // System.out.println("Current club is " + players.Barrios.getClub().getName());
        // playerNamesList(playersListAtletico_Madrid);
        // playerNamesList(playersListCelta_Vigo);
        // UNCOMMENT BEFORE FINAL COMMIT!!!!!


        playerTransfer(playersListAtletico_Madrid, playersListCelta_Vigo, players.Barrios, clubs.Celta_Vigo);

        // UNCOMMENT BEFORE FINAL COMMIT!!!!!
        // System.out.println("Current club is " + players.Barrios.getClub().getName());
        // playerNamesList(playersListAtletico_Madrid);
        // playerNamesList(playersListCelta_Vigo);
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



    }

    static void playerTransfer(
        ArrayList<Player> currentPlayersList, ArrayList<Player> newPlayersList, Player player, Club club
        ) {
            if (currentPlayersList.contains(player)) {
                currentPlayersList.remove(player);
                newPlayersList.add(player);
                club.setPlayerList(newPlayersList);
                player.setClub(club);
            } else {
                System.out.println("Player " + player.getName() + " was not found in club " + club.getName());
            }
    }

    static void playerNamesList(ArrayList<Player> playerNamesList) {
        System.out.print("Players list of club " + playerNamesList.get(0).getClub().getName() + " :");
        playerNamesList.forEach( (n) -> { System.out.print(n.getName() + ", "); } );
        System.out.println();
    }
}

