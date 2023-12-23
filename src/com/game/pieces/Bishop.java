package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class Bishop extends Piece {
    public Bishop(Game.Color color, int[] ubication){
        super(color, Name.Bishop, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        return null;
    }
}