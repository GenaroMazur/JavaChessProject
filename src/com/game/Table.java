package com.game;

import java.util.ArrayList;

public class Table {
    public final Cell[][] cells;

    public Table() {

        cells = new Cell[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {

                int[] coordinates = {x, y};
                cells[x][y] = new Cell(coordinates);
            }
        }
    }
}
