package com.home;

public class Rules {

    Grid grid;

    public Rules(Grid grid) {

        this.grid = grid;
    }

    public int getState(int i, int j) {
        if (i < 0 || i >= grid.getWidth()) {
            return 0;
        }

        if (j < 0 || j >= grid.getHeight()) {
            return 0;
        }

        return this.grid.getGrid()[i][j];
    }

    public int countGreenNeighbours(int i, int j) {
        int count = 0;

        count += getState(i - 1, j - 1);
        count += getState(i, j - 1);
        count += getState(i + 1, j - 1);

        count += getState(i - 1, j);
        count += getState(i + 1, j);

        count += getState(i - 1, j + 1);
        count += getState(i, j + 1);
        count += getState(i + 1, j + 1);

        return count;
    }
}
