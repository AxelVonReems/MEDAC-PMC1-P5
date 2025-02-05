package com.data;

import com.coach.Coach;
import com.coach.Formation;

/**
 * This class creates "Coach" instances
 */
public class CoachData {

    /**
     * Coach de Barcelona Hansi Flick
     */
    public Coach Hansi_Flick;

    /**
     * Coach de Real Madrid Ancelotti
     */
    public Coach Ancelotti;

    /**
     * Coach de Atlético Madrid Simeone
     */
    public Coach Simeone;

    /**
     * Coach de Celta Vigo Claudio Giraldez
     */
    public Coach Claudio_Giraldez;

    /**
     * Coach de Rayo Vallecano Iñigo Perez
     */
    public Coach Iñigo_Perez;

    /**
     * Function that creates coaches
     * @param club instances of Club class
     */
    public CoachData(ClubData club) {

        // Barcelona
        Hansi_Flick = new Coach("Hansi Flick", Formation._3_5_2_, club.Barcelona);

        // Real Madrid
        Ancelotti = new Coach("Ancelotti", Formation._4_1_4_1_, club.Real_Madrid);

        // Atlético Madrid
        Simeone = new Coach("Simeone", Formation._4_4_2_, club.Atletico_Madrid);

        // Celta Vigo
        Claudio_Giraldez = new Coach("Claudio Giraldez", Formation._4_2_3_1_, club.Celta_Vigo);

        // Rayo Vallecano
        Iñigo_Perez = new Coach("Iñigo Perez", Formation._4_3_3_, club.Rayo_Vallecano);
    }
}
