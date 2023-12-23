package com.game;

import com.game.pieces.*;

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

        cells[0][0].take(new Rook(Game.Color.WHITE, new int[]{0, 0}));
        cells[1][0].take(new Knight(Game.Color.WHITE, new int[]{1, 0}));
        cells[2][0].take(new Bishop(Game.Color.WHITE, new int[]{2, 0}));
        cells[3][0].take(new Queen(Game.Color.WHITE, new int[]{3, 0}));
        cells[4][0].take(new King(Game.Color.WHITE, new int[]{4, 0}));
        cells[5][0].take(new Bishop(Game.Color.WHITE, new int[]{5, 0}));
        cells[6][0].take(new Knight(Game.Color.WHITE, new int[]{6, 0}));
        cells[7][0].take(new Rook(Game.Color.WHITE, new int[]{7, 0}));


        /*for (int i = 0; i < 8; i++) {
            cells[i][1].take(new Pawn(Game.Color.WHITE, new int[]{i, 1}));
        }*/

    }

    public void showTable(){
        for (int j = 7; j >= 0; j--) {

            for (int i = 0; i < 8; i++) {
                String toPrint;
                if (cells[i][j].taken) {
                    char colorPiece;
                    if(cells[i][j].takenBy.color == Game.Color.WHITE){
                        colorPiece = 'W';
                    }else {
                        colorPiece = 'B';
                    }
                    toPrint = colorPiece + cells[i][j].takenBy.getAlias() + " ";
                } else {
                    toPrint = cells[i][j].name + " ";
                }
                System.out.print(toPrint);
            }
            System.out.print("\n");
        }
    }
}
