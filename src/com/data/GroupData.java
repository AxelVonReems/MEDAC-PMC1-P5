package com.data;

import java.util.ArrayList;
import java.util.Arrays;

import com.player.Player;

/**
 * Class for completing Club instances with player lists, coaches and presidents
 */
public class GroupData {

    /**
     * Class for completing Club instances with player lists, coaches and presidents
     * @param clubs instances of Club class
     * @param players instances of Player class
     * @param coaches instances of Coach class
     * @param presidents instances of President class
     */
    public static void ClubCreation(ClubData clubs, PlayerData players, CoachData coaches, PresidentData presidents) {

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
    }
}
