package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class Knight extends Piece {
    public Knight(Game.Color color, int[] ubication) {
        super(color, Name.Knight, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        ArrayList<Cell> avalibleMoves = new ArrayList<>();


        return avalibleMoves;
    }
}