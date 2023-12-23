package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class King extends Piece {
    public King(Game.Color color, int[] ubication){
        super(color, Name.King, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        return null;
    }
}