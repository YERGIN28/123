package Assignment2;

import java.util.*;
import java.util.stream.Collectors;

public class SportsClub {
    private List<Player> players = new ArrayList<>();

    // Add a player to the club
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Filter players by sport
    public List<Player> filterBySport(String sportName) {
        return players.stream()
                .filter(player -> player.getSportName().equalsIgnoreCase(sportName))
                .collect(Collectors.toList());
    }

    // Search for a player by name
    public Player searchByName(String playerName) {
        return players.stream()
                .filter(player -> player.getPlayerName().equalsIgnoreCase(playerName))
                .findFirst()
                .orElse(null);
    }

    // Sort players by age
    public List<Player> sortPlayersByAge() {
        return players.stream()
                .sorted(Comparator.comparingInt(Player::getAge))
                .collect(Collectors.toList());
    }

    // Display all players
    public void displayAllPlayers() {
        players.forEach(Player::displayDetails);
    }
}
