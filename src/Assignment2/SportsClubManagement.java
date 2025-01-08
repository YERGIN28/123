package Assignment2;

import java.util.*;

public class SportsClubManagement {
    public static void main(String[] args) {
        // Create a SportsClub instance
        SportsClub club = new SportsClub();

        // Add players to the club
        club.addPlayer(new Player("Football", "John Doe", 25, "Forward"));
        club.addPlayer(new Player("Basketball", "Alice Smith", 22, "Guard"));
        club.addPlayer(new Player("Tennis", "Tom Brown", 28, "Singles"));
        club.addPlayer(new Player("Football", "Mike Johnson", 20, "Goalkeeper"));

        // Display all players
        System.out.println("All Players:");
        club.displayAllPlayers();

        // Filter players by sport
        System.out.println("\nFootball Players:");
        List<Player> footballPlayers = club.filterBySport("Football");
        footballPlayers.forEach(Player::displayDetails);

        // Search for a player by name
        System.out.println("\nSearching for Player 'Alice Smith':");
        Player foundPlayer = club.searchByName("Alice Smith");
        if (foundPlayer != null) {
            foundPlayer.displayDetails();
        } else {
            System.out.println("Player not found.");
        }

        // Sort players by age
        System.out.println("\nPlayers Sorted by Age:");
        List<Player> sortedPlayers = club.sortPlayersByAge();
        sortedPlayers.forEach(Player::displayDetails);

        // Demonstrate overridden methods
        System.out.println("\nOverridden Method Demonstrations:");
        Player player1 = new Player("Football", "John Doe", 25, "Forward");
        Player player2 = new Player("Football", "John Doe", 25, "Forward");
        System.out.println("player1.equals(player2): " + player1.equals(player2));
        System.out.println("player1.hashCode(): " + player1.hashCode());
        System.out.println("player2.hashCode(): " + player2.hashCode());
        System.out.println("player1.toString(): " + player1.toString());
    }
}

