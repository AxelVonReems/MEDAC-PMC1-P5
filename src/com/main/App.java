package com.main;

import java.time.LocalDate;

import com.player.Player;
import com.player.Position;
import com.player.TransferStatus;

/**
 * Main class of the application
 */
public class App {
    public static LocalDate setDate(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, month);
        return date;
    } 
    public static void main(String[] args) throws Exception {
        Player player1 = new Player(
            "Swampstench Apeface",
            setDate(1, 2, 1990),
            "Zimbamwe",
            Position.GOALKEEPER,
            45,
            TransferStatus.WITHOUT_REQUEST);
        System.out.println(player1.toString());
    }
}

