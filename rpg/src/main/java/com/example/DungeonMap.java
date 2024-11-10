package com.example;
import java.util.Random;

public class DungeonMap {
    private char[][] map;
    private int playerX, playerY;
    private Monster currentMonster;
    private boolean reachedExit;

    public DungeonMap(int rows, int cols) {
        map = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                map[i][j] = '.';
            }
        }

        // Placer le joueur en haut à gauche
        playerX = 0;
        playerY = 0;
        map[playerX][playerY] = 'P';

        // Placer la sortie en bas à droite
        map[rows - 1][cols - 1] = 'E';

        // Placer des obstacles et des monstres aléatoirement
        placeObstaclesAndMonsters();
    }

    private void placeObstaclesAndMonsters() {
        Random random = new Random();
        int numMonsters = 5;

        for (int i = 0; i < numMonsters; i++) {
            int x, y;
            do {
                x = random.nextInt(map.length);
                y = random.nextInt(map[0].length);
            } while (map[x][y] != '.');
            map[x][y] = 'M'; // Placer un monstre
        }
    }

    public void displayMap() {
        System.out.println("\n-------- Carte du Donjon --------");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    public void movePlayer(String direction, Player player) {
        map[playerX][playerY] = '.'; // Effacer la position précédente
        switch (direction.toLowerCase()) {
            case "haut":
                if (playerX > 0) playerX--;
                break;
            case "bas":
                if (playerX < map.length - 1) playerX++;
                break;
            case "gauche":
                if (playerY > 0) playerY--;
                break;
            case "droite":
                if (playerY < map[0].length - 1) playerY++;
                break;
            default:
                System.out.println("Direction invalide !");
                return;
        }

        // Actions sur la nouvelle position
        if (map[playerX][playerY] == 'M') {
            System.out.println("Un monstre apparait !");
            currentMonster = new Monster("Gobelin Enragé", 50, 10);
        } else if (map[playerX][playerY] == 'E') {
            reachedExit = true; // Le joueur a atteint la sortie
        }

        map[playerX][playerY] = 'P'; // Mettre à jour la position du joueur
    }

    public boolean hasEncounteredMonster() {
        return currentMonster != null;
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }

    public void clearCurrentMonster() {
        currentMonster = null;
    }

    public boolean hasReachedExit() {
        return reachedExit;
    }
}
