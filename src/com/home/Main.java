package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();

        int height = sc.nextInt();

        int[][] gameGrid = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                gameGrid[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        Grid grid = new Grid(width, height, gameGrid);
        Rules rule = new Rules(grid);
        Simulation simulation = new Simulation(grid, rule);

        grid.setGrid(gameGrid);

        simulation.numberOfGeneration(N, x1, y1);
    }
}
