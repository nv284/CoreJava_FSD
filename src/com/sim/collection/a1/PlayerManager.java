package com.sim.collection.a1;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

public class PlayerManager {
	/*private List<Player> players;

    public PlayerManager() {
        players = new ArrayList<>();
    }*/
	ArrayList< Player> players = new ArrayList<Player>();

    // Add a new player
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Added: " + player.getName());
    }
    
 // Remove a player by ID
    public void removePlayer(int playerId) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getId() == playerId) {
                iterator.remove();
                System.out.println("Removed player with ID: " + playerId);
                return;
            }
        }
        System.out.println("Player with ID " + playerId + " not found.");
        
    }
 // List all players
    public void listPlayers() {
        System.out.println("Listing all players:");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayerManager manager = new PlayerManager();
        
        while (true) {
            System.out.println("1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. List Players");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter player ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter player name: ");
                    String name = scanner.nextLine();
                    manager.addPlayer(new Player(id, name));
                    break;
                case 2:
                    System.out.print("Enter player ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removePlayer(removeId);
                    break;
                case 3:
                    manager.listPlayers();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
