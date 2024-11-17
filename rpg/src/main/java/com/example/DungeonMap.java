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

        // Placer des obstacles, des monstres et des potions aléatoirement
        placeObstaclesAndMonstersAndPotions();
    }

    private void placeObstaclesAndMonstersAndPotions() {
        Random random = new Random();
        int numMonsters = 20;
        int numPotions = 10;
        char[] monsterTypes = {'G', 'O', 'D'}; // G pour Gobelin, O pour Ogre, D pour Dragon

        for (int i = 0; i < numMonsters; i++) {
            int x, y;
            char monster = monsterTypes[random.nextInt(monsterTypes.length)];
            do {
                x = random.nextInt(map.length);
                y = random.nextInt(map[0].length);
            } while (map[x][y] != '.');
            map[x][y] = monster; // Placer un monstre différent
        }

        for (int i = 0; i < numPotions; i++) {
            int x, y;
            do {
                x = random.nextInt(map.length);
                y = random.nextInt(map[0].length);
            } while (map[x][y] != '.');
            map[x][y] = 'H'; // Placer une potion de soin
        }
    }

    public void displayMap() {
        System.out.println("\n-------- Carte du Donjon --------");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                char tile = map[i][j];
                switch (tile) {
                    case 'P':
                        System.out.print("\u001B[32m" + tile + "  " + "\u001B[0m"); // Joueur en vert
                        break;
                    case 'G':
                        System.out.print("\u001B[31m" + tile + "  " + "\u001B[0m"); // Gobelin en rouge
                        break;
                    case 'O':
                        System.out.print("\u001B[33m" + tile + "  " + "\u001B[0m"); // Ogre en jaune
                        break;
                    case 'D':
                        System.out.print("\u001B[35m" + tile + "  " + "\u001B[0m"); // Dragon en violet
                        break;
                    case 'E':
                        System.out.print("\u001B[34m" + tile + "  " + "\u001B[0m"); // Sortie en bleu
                        break;
                    case 'H':
                        System.out.print("\u001B[36m" + tile + "  " + "\u001B[0m"); // Potion en cyan
                        break;
                    default:
                        System.out.print(tile + "  "); // Case vide
                        break;
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    public void movePlayer(String direction, Player player) {
        int newX = playerX;
        int newY = playerY;

        switch (direction.toLowerCase()) {
            case "haut":
                if (playerX > 0) newX--;
                break;
            case "bas":
                if (playerX < map.length - 1) newX++;
                break;
            case "gauche":
                if (playerY > 0) newY--;
                break;
            case "droite":
                if (playerY < map[0].length - 1) newY++;
                break;
            default:
                System.out.println("Direction invalide !");
                return;
        }

        char currentTile = map[newX][newY];
        if (currentTile == 'G' || currentTile == 'O' || currentTile == 'D') {
            String monsterName = (currentTile == 'G') ? "Gobelin Enragé" : (currentTile == 'O') ? "Ogre Brutal" : "Dragon Terrifiant";
            int monsterHealth = (currentTile == 'G') ? 50 : (currentTile == 'O') ? 100 : 200;
            int monsterDamage = (currentTile == 'G') ? 10 : (currentTile == 'O') ? 20 : 40;
            System.out.println("Un " + monsterName + " apparait !");
            currentMonster = new Monster(monsterName, monsterHealth, monsterDamage);
        } else if (currentTile == 'E') {
            reachedExit = true; // Le joueur a atteint la sortie
        } else if (currentTile == 'H') {
            System.out.println("Vous avez trouvé une potion magique ! Votre vie augmente de 20 points.");
            player.increaseHealth(20);
        }

        // Mettre à jour la position du joueur sur la carte
        map[playerX][playerY] = '.'; // Effacer l'ancienne position
        playerX = newX;
        playerY = newY;
        map[playerX][playerY] = 'P'; // Placer le joueur à la nouvelle position
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
