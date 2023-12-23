package com.game;

import java.util.ArrayList;


public class Piece {

    public enum Name {
        King, Queen, Bishop, Knight, Pawn, Rook
    }

    public Game.Color color;
    public Name name;
    public int[] position;
    protected boolean wasMove = false;

    public ArrayList<Cell> moves(Cell[][] boardState) {
        return null;
    }

    public Piece(Game.Color color, Name name, int[] position) {
        if (!(position[0] >= 0 && position[0] <= 7 && position[1] >= 0 && position[1] <= 7)) {
            throw new Error("Posicion invalida");
        }

        this.color = color;
        this.position = position;
        this.name = name;
    }

    public String getAlias(){
        switch (this.name){
            case Pawn -> {
                return "P";
            }
            case Bishop -> {
                return "B";
            }
            case King -> {
                return "K";
            }
            case Queen -> {
                return "Q";
            }
            case Rook -> {
                return "R";
            }
            case Knight -> {
                return "N";
            }
            default -> {
                return "";
            }
        }
    }
}
