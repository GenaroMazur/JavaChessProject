package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class Pawn extends Piece {
    public Pawn(Game.Color color, int[] ubication){
        super(color, Name.Pawn, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        return null;
    }
}
