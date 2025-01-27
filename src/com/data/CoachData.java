package com.data;

import com.coach.Coach;
import com.coach.Formation;

/**
 * This class creates "Coach" instances
 */
public class CoachData {

    // Barcelona
    public Coach Hansi_Flick;

    // Real Madrid
    public Coach Ancelotti;

    // Atlético Madrid
    public Coach Simeone;

    // Celta Vigo
    public Coach Claudio_Giraldez;

    // Rayo Vallecano
    public Coach Iñigo_Perez;

    public CoachData() {

        // Barcelona
        Hansi_Flick = new Coach("Hansi Flick", Formation._3_5_2_);

        // Real Madrid
        Ancelotti = new Coach("Ancelotti", Formation._4_1_4_1_);

        // Atlético Madrid
        Simeone = new Coach("Simeone", Formation._4_2_2_);

        // Celta Vigo
        Claudio_Giraldez = new Coach("Claudio Giraldez", Formation._4_2_3_1_);

        // Rayo Vallecano
        Iñigo_Perez = new Coach("Iñigo Perez", Formation._4_3_3_);
    }
}
