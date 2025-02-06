package com.data;

import com.president.President;
import com.employee.Employee;

/**
 * This class creates "President" instances
 */
public class PresidentData {

    /**
     * President of Barcelona
     */
    public President Joan_Laporta;

    /**
     * President of Real Madrid
     */
    public President Florentino_Perez;

    /**
     * President of Atlético Madrid
     */
    public President Enrique_Cerezo;

    /**
     * President of Celta Vigo
     */
    public President Marian_Mourino_Terrazo;

    /**
     * President of Rayo Vallecano
     */
    public President Raul_Martin_Presa;

    /**
     * Function that creates clubs
     * @param club instances of Club class
     */
    public PresidentData(ClubData club) {

        // Barcelona
        Joan_Laporta = new President(
            "01234567A", "Joan Laporta", Employee.setDate(29, 6, 1962), "España", club.Barcelona
        );

        // Real Madrid
        Florentino_Perez = new President(
            "34567890B", "Florentino Pérez", Employee.setDate(8, 3, 1947), "España", club.Real_Madrid
        );

        // Atlético Madrid
        Enrique_Cerezo = new President(
            "78901234C", "Enrique Cerezo", Employee.setDate(27, 2, 1948), "España", club.Atletico_Madrid
        );

        // Celta Vigo
        Marian_Mourino_Terrazo = new President(
            "67890123D", "Marián Mouriño Terrazo", Employee.setDate(25, 5, 1975), "España", club.Celta_Vigo
        );

        // Rayo Vallecano
        Raul_Martin_Presa = new President("56789012E", "Raúl Martín Presa", Employee.setDate(1, 1, 1977), "España", club.Rayo_Vallecano);
    }
}
