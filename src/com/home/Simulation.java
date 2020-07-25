package com.home;

public class Simulation extends Rules {

    public Simulation(int width, int height) {
        super(width, height);
    }

    public void print() {
        for (int i = 0; i < width; i++) {
            StringBuilder line = new StringBuilder("");
            for (int j = 0; j < height; j++) {
                if (this.grid[i][j] == 0) {
                    line.append("0");
                } else {
                    line.append("1");
                }
            }
            line.append("");
            System.out.println(line);
        }
    }

    public int getState(int i, int j) {
        if (i < 0 || i >= width) {
            return 0;
        }

        if (j < 0 || j >= height) {
            return 0;
        }

        return this.grid[i][j];
    }

    public void setGreen(int i, int j) {
        this.grid[i][j] = 1;
    }

    public void setRed(int i, int j) {
        this.grid[i][j] = 0;
    }

    public void step() {
        int[][] newGrid = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int greenNeighbours = countGreenNeighbours(i, j);

                if (getState(i, j) == 1) {
                    if (greenNeighbours == 0 || greenNeighbours == 1 || greenNeighbours == 4
                            || greenNeighbours == 5 || greenNeighbours == 7 || greenNeighbours == 8) {
                        newGrid[i][j] = 0;
                    } else if (greenNeighbours == 2 || greenNeighbours == 3 || greenNeighbours == 6) {
                        newGrid[i][j] = 1;
                    }
                } else {
                    if (getState(i, j) == 0) {
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

        this.grid = newGrid;
    }
}
