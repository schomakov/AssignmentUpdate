package com.home;

public class Simulation {

    Grid grid;
    Rules rule;

    public Simulation(Grid grid, Rules rule) {

        this.grid = grid;
        this.rule = rule;

    }

    public void print() {
        for (int i = 0; i < grid.getWidth(); i++) {
            StringBuilder line = new StringBuilder("");
            for (int j = 0; j < grid.getHeight(); j++) {
                if (this.grid.getGrid()[i][j] == 0) {
                    line.append("0");
                } else {
                    line.append("1");
                }
            }
            line.append(" ");
            System.out.println(line);
        }
    }

    public void step() {
        int[][] newGrid = new int[grid.getWidth()][grid.getHeight()];

        for (int i = 0; i < grid.getWidth(); i++) {
            for (int j = 0; j < grid.getHeight(); j++) {
                int greenNeighbours = rule.countGreenNeighbours(i, j);

                if (rule.getState(i, j) == 1) {
                    if (greenNeighbours == 0 || greenNeighbours == 1 || greenNeighbours == 4
                            || greenNeighbours == 5 || greenNeighbours == 7 || greenNeighbours == 8) {
                        newGrid[i][j] = 0;
                    } else if (greenNeighbours == 2 || greenNeighbours == 3 || greenNeighbours == 6) {
                        newGrid[i][j] = 1;
                    }
                } else {
                    if (rule.getState(i, j) == 0) {
                        if (greenNeighbours == 3 || greenNeighbours == 6) {
                            newGrid[i][j] = 1;
                        } else if (greenNeighbours == 0 || greenNeighbours == 1 || greenNeighbours == 4
                                || greenNeighbours == 5 || greenNeighbours == 7 || greenNeighbours == 8) {
                            newGrid[i][j] = 0;
                        }
                    }
                }
            }
        }

        this.grid.setGrid(newGrid);
    }
}
