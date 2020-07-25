package com.home;

public class Grid{

    int width;
    int height;
    int[][] grid;

    public Grid(int width, int height) {
        super();
        this.width = width;
        this.height = height;

        this.grid = new int[width][height];
    }
}
