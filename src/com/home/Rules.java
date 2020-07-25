package com.home;

public class Rules extends Grid {

    public Rules(int width, int height) {
        super(width, height);
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
