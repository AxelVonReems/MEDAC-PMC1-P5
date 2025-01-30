package com.data;

import com.club.Club;

/**
 * This class creates "Club" instances
 */

public class ClubData {

    // Barcelona
    public Club Barcelona;

    // Real Madrid
    public Club Real_Madrid;

    // Atlético Madrid
    public Club Atletico_Madrid;

    // Celta Vigo
    public Club Celta_Vigo;

    // Rayo Vallecano
    public Club Rayo_Vallecano;

    public ClubData() {

        // Barcelona
        Barcelona = new Club("Barcelona", "BCN");

        // Real Madrid
        Real_Madrid = new Club("Real Madrid", "RMD");

        // Atlético Madrid
        Atletico_Madrid = new Club("Atlético Madrid", "AMD");

        // Celta Vigo
        Celta_Vigo = new Club("Celta Vigo", "CVG");

        // Rayo Vallecano
        Rayo_Vallecano = new Club("Rayo Vallecano", "RVC");
    }
}
