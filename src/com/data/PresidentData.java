package com.data;

import com.president.President;

/**
 * This class creates "President" instances
 */
public class PresidentData {

    // Barcelona
    public President Joan_Laporta;

    // Real Madrid
    public President Florentino_Perez;

    // Atlético Madrid
    public President Enrique_Cerezo;

    // Celta Vigo
    public President Marian_Mourino_Terrazo;

    // Rayo Vallecano
    public President Raul_Martin_Presa;

    public PresidentData(ClubData club) {

        // Barcelona
        Joan_Laporta = new President("01234567A", "Joan Laporta", club.Barcelona);

        // Real Madrid
        Florentino_Perez = new President("34567890B", "Florentino Pérez", club.Real_Madrid);

        // Atlético Madrid
        Enrique_Cerezo = new President("78901234C", "Enrique Cerezo", club.Atletico_Madrid);

        // Celta Vigo
        Marian_Mourino_Terrazo = new President("67890123D", "Marián Mouriño Terrazo", club.Celta_Vigo);

        // Rayo Vallecano
        Raul_Martin_Presa = new President("56789012E", "Raúl Martín Presa", club.Rayo_Vallecano);
    }
}
