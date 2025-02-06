package com.data;

import com.coach.Coach;
import com.coach.Formation;
import com.employee.Employee;

/**
 * This class creates "Coach" instances
 */
public class CoachData {

    /**
     * Coach of Barcelona Hansi Flick
     */
    public Coach Hansi_Flick;

    /**
     * Coach of Real Madrid Ancelotti
     */
    public Coach Ancelotti;

    /**
     * Coach of Atlético Madrid Simeone
     */
    public Coach Simeone;

    /**
     * Coach of Celta Vigo Claudio Giraldez
     */
    public Coach Claudio_Giraldez;

    /**
     * Coach of Rayo Vallecano Iñigo Perez
     */
    public Coach Iñigo_Perez;

    /**
     * Function that creates coaches
     * @param club instances of Club class
     */
    public CoachData(ClubData club) {

        // Barcelona
        Hansi_Flick = new Coach(
            "Hansi Flick", Employee.setDate(24, 2, 1965), "Alemania", Formation._3_5_2_, club.Barcelona
        );

        // Real Madrid
        Ancelotti = new Coach(
            "Carlo Ancelotti", Employee.setDate(10, 6, 1959), "Italia", Formation._4_1_4_1_, club.Real_Madrid
        );

        // Atlético Madrid
        Simeone = new Coach(
            "Diego Pablo Simeone", Employee.setDate(28, 4, 1970), "Argentina", Formation._4_4_2_, club.Atletico_Madrid
        );

        // Celta Vigo
        Claudio_Giraldez = new Coach(
            "Claudio Giraldez", Employee.setDate(24, 2, 1988), "España", Formation._4_2_3_1_, club.Celta_Vigo
        );

        // Rayo Vallecano
        Iñigo_Perez = new Coach(
            "Iñigo Perez", Employee.setDate(18, 1, 1988), "España", Formation._4_3_3_, club.Rayo_Vallecano
        );
    }
}
