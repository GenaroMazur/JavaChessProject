package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class Queen extends Piece {
    public Queen(Game.Color color, int[] ubication){
        super(color, Name.Queen, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        return null;
    }
}