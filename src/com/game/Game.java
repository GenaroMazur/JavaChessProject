package com.game;

import com.game.pieces.Rook;

import java.util.ArrayList;

public class Game {
    public enum Color {
        BLACK, WHITE
    }

    public Game() {
        Table table = new Table();

        table.showTable();

        //TEST
        ArrayList<Cell> moves = table.cells[1][0].takenBy.moves(table.cells);
        for (Cell move : moves) {
            System.out.print(move.name + " ");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();

    }
}
