package com.home;

public class Grid {

    int width;
    int height;
    int[][] grid;

    public Grid(int width, int height, int[][] grid) {
        this.width = width;
        this.height = height;
        this.grid = grid;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void setGreen(int i, int j) {
        this.grid[i][j] = 1;
    }

    public void setRed(int i, int j) {
        this.grid[i][j] = 0;
    }
}
