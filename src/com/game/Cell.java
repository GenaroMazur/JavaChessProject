package com.game;

import java.util.ArrayList;

public class Cell {
    private final static String[] colums = {"A","B","C","D","E","F","G","H"};

    public final String name;
    public final Game.Color color;
    public final int[] ubication;
    public boolean taken;
    public Piece takenBy;

    public Cell(int[] position) {

        if(position.length >2){
            throw new Error("Posicion unicamente deben ser 2 elementos");
        }

        if(!(position[0] >= 0 && position[0] <= 7 && position[1] >= 0 && position[1] <= 7)){
            throw new Error("Posicion invalida");
        }
        Game.Color color;

        if ((position[0] + position[1]) % 2 == 0) {
            color = Game.Color.BLACK;
        } else {
            color = Game.Color.WHITE;
        }

        int row = position[1] + 1;
        this.name = Cell.colums[position[0]] + Integer.toString(row);
        this.color = color;
        this.ubication = position;
    }

    public void take(Piece piece){
        this.takenBy = piece;
        this.taken = true;
    }

    public  void unTake(){
        this.takenBy = null;
        this.taken = false;
    }

}
