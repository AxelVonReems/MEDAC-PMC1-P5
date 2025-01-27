package com.main;

import java.time.LocalDate;

import com.player.Player;
import com.player.Position;
import com.player.TransferStatus;
import com.data.ClubData;
import com.data.CoachData;
import com.data.PlayerData;
import com.data.PresidentData;

/**
 * Main class of the application
 */
public class App {
    public static LocalDate setDate(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, month);
        return date;
    }
    public static void main(String[] args) throws Exception {

        /**
         * Data creation
         */
        PlayerData players = new PlayerData();
        CoachData coaches = new CoachData();
        PresidentData presidents = new PresidentData();
        ClubData clubs = new ClubData();

        System.out.println(clubs.Celta_Vigo);
    }
}

