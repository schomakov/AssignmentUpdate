package com.home;

public class Main {

    public static void main(String[] args) {

        Simulation grid = new Simulation(4,4);

        grid.setGreen(0, 0);
        grid.setGreen(0, 3);
        grid.setGreen(1, 0);
        grid.setGreen(1, 1);
        grid.setGreen(1, 2);
        grid.setGreen(1, 3);
        grid.setGreen(2, 1);
        grid.setGreen(3, 0);
        grid.setGreen(3, 2);


        grid.print();
        grid.step();

        System.out.println();
        grid.print();

        System.out.println();

        grid.step();
        grid.print();
    }
}
