package com.data;

import java.time.LocalDate;

import com.player.Player;
import com.player.Position;
import com.player.TransferStatus;
import com.employee.Employee;

/**
 * This class creates "Player" instances
 */
public class PlayerData {

    /**
     * Players of Barcelona
     */
    public Player Ter_Stegen;
    public Player Balde;
    public Player Gavi;
    public Player Fermin;
    public Player Lewandowski;

    /**
     * Players of Real Madrid
     */
    public Player Courtois;
    public Player Carvajal;
    public Player Modric;
    public Player Camavinga;
    public Player Mbappe;

    /**
     * Players of Atlético Madrid
     */
    public Player Oblak;
    public Player Azpilicueta;
    public Player Barrios;
    public Player Lemar;
    public Player Griezmann;

    /**
     * Players of Celta Vigo
     */
    public Player Ivan_Villar;
    public Player Starfelt;
    public Player Hugo_Sotelo;
    public Player Ilaix_Moriba;
    public Player Douvikas;

    /**
     * Players of Rayo Vallecano
     */
    public Player Cardenas;
    public Player Andrei;
    public Player Pedro_Diaz;
    public Player Isi;
    public Player Camello;

    /**
     * Function that creates players
     * @param club instances of Club class
     */
    public PlayerData (ClubData club) {

        // Barcelona
        Ter_Stegen = new Player(
        "Ter Stegen", Employee.setDate(30, 4, 1992), "Alemania",
        Position.GOALKEEPER, 1, TransferStatus.WITHOUT_REQUEST, club.Barcelona);
        Balde = new Player(
        "Balde", Employee.setDate(18, 10, 2003), "España",
        Position.DEFENDER, 3, TransferStatus.WITHOUT_REQUEST, club.Barcelona);
        Gavi = new Player(
        "Gavi", Employee.setDate(5, 8, 2004), "España",
        Position.MIDFIELDER, 6, TransferStatus.WITHOUT_REQUEST, club.Barcelona);
        Fermin = new Player(
        "Fermin", Employee.setDate(11, 5, 2004), "España",
        Position.MIDFIELDER, 16, TransferStatus.WITHOUT_REQUEST, club.Barcelona);
        Lewandowski = new Player(
        "Lewandowski", Employee.setDate(21, 8, 1988), "Polonia",
        Position.FORWARD, 9, TransferStatus.WITHOUT_REQUEST, club.Barcelona);

        // Real Madrid
        Courtois = new Player(
        "Courtois", Employee.setDate(11, 5, 1992), "Bélgica",
        Position.GOALKEEPER, 1, TransferStatus.WITHOUT_REQUEST, club.Real_Madrid);
        Carvajal = new Player(
        "Carvajal", Employee.setDate(11, 1, 1992), "España",
        Position.DEFENDER, 2, TransferStatus.WITHOUT_REQUEST, club.Real_Madrid);
        Modric = new Player(
        "Modrić", Employee.setDate(9, 9, 1985), "Croacia",
        Position.MIDFIELDER, 10, TransferStatus.WITHOUT_REQUEST, club.Real_Madrid);
        Camavinga = new Player(
        "Camavinga", Employee.setDate(10, 11, 2002), "Francia",
        Position.MIDFIELDER, 6, TransferStatus.WITHOUT_REQUEST, club.Real_Madrid);
        Mbappe = new Player(
        "Mbappé", Employee.setDate(20, 12, 1990), "Francia",
        Position.FORWARD, 9, TransferStatus.WITHOUT_REQUEST, club.Real_Madrid);

        // Atlético Madrid
        Oblak = new Player(
        "Oblak", Employee.setDate(7, 11, 1993), "Eslovenia",
        Position.GOALKEEPER, 13, TransferStatus.WITHOUT_REQUEST, club.Atletico_Madrid);
        Azpilicueta = new Player(
        "Azpilicueta", Employee.setDate(28, 8, 1989), "España",
        Position.DEFENDER, 3, TransferStatus.WITHOUT_REQUEST, club.Atletico_Madrid);
        Barrios = new Player(
        "Barrios", Employee.setDate(15, 6, 2003), "España",
        Position.MIDFIELDER, 8, TransferStatus.WITHOUT_REQUEST, club.Atletico_Madrid);
        Lemar = new Player(
        "Lemar", Employee.setDate(12, 11, 1995), "Francia",
        Position.MIDFIELDER, 11, TransferStatus.WITHOUT_REQUEST, club.Atletico_Madrid);
        Griezmann = new Player(
        "Griezmann", Employee.setDate(21, 3, 1991), "Francia",
        Position.FORWARD, 7, TransferStatus.WITHOUT_REQUEST, club.Atletico_Madrid);

        // Celta Vigo
        Ivan_Villar = new Player(
        "Ivan Villar", Employee.setDate(9, 7, 1997), "España",
        Position.GOALKEEPER, 1, TransferStatus.WITHOUT_REQUEST, club.Celta_Vigo);
        Starfelt = new Player(
        "Starfelt", Employee.setDate(1, 6, 1995), "Suecia",
        Position.DEFENDER, 2, TransferStatus.WITHOUT_REQUEST, club.Celta_Vigo);
        Hugo_Sotelo = new Player(
        "Hugo Sotelo", Employee.setDate(19, 12, 2003), "España",
        Position.MIDFIELDER, 4, TransferStatus.WITHOUT_REQUEST, club.Celta_Vigo);
        Ilaix_Moriba = new Player(
        "Ilaix Moriba", Employee.setDate(19, 1, 2003), "Guinea",
        Position.MIDFIELDER, 6, TransferStatus.WITHOUT_REQUEST, club.Celta_Vigo);
        Douvikas = new Player(
        "Douvikas", Employee.setDate(2, 8, 1999), "Grecia",
        Position.FORWARD, 9, TransferStatus.WITHOUT_REQUEST, club.Celta_Vigo);

        // Rayo Vallecano
        Cardenas = new Player(
        "Cárdenas", Employee.setDate(28, 3, 1997), "España",
        Position.GOALKEEPER, 1, TransferStatus.WITHOUT_REQUEST, club.Rayo_Vallecano);
        Andrei = new Player(
        "Andrei", Employee.setDate(20, 6, 1998), "Rumanía",
        Position.DEFENDER, 2, TransferStatus.WITHOUT_REQUEST, club.Rayo_Vallecano);
        Pedro_Diaz = new Player(
        "Pedro Díaz", Employee.setDate(5, 6, 1998), "España",
        Position.MIDFIELDER, 4, TransferStatus.WITHOUT_REQUEST, club.Rayo_Vallecano);
        Isi = new Player(
        "Isi", Employee.setDate(27, 12, 1994), "España",
        Position.MIDFIELDER, 7, TransferStatus.WITHOUT_REQUEST, club.Rayo_Vallecano);
        Camello = new Player(
        "Camello", Employee.setDate(10, 2, 2001), "España",
        Position.FORWARD, 14, TransferStatus.WITHOUT_REQUEST, club.Rayo_Vallecano);
    }
}
