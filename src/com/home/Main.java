package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter grid size: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a width: ");
        int width = sc.nextInt();
        System.out.println("Enter a height: ");
        int height = sc.nextInt();

        System.out.println("Enter grid element: ");

        int[][] gameGrid = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                gameGrid[i][j] = sc.nextInt();
            }
        }

        Grid grid = new Grid(width, height, gameGrid);
        Rules rule = new Rules(grid);
        Simulation simulation = new Simulation(grid, rule);

        grid.setGrid(gameGrid);

        simulation.print();
        simulation.step();

        System.out.println();
        simulation.print();

        System.out.println();

        simulation.step();
        simulation.print();

        System.out.println();
        simulation.step();
        simulation.print();
    }
}
