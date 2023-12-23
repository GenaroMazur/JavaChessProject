package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class Pawn extends Piece {
    public Pawn(Game.Color color, int[] ubication) {
        super(color, Name.Pawn, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        ArrayList<Cell> availableMoves = new ArrayList<>();

        if (!boardState[position[0]][position[1] + 1].taken) {
            availableMoves.add(boardState[position[0]][position[1] + 1]);
            if (!wasMove && !boardState[position[0]][position[1] + 2].taken) {
                availableMoves.add(boardState[position[0]][position[1] + 2]);
            }
        }

        if ( position[1] + 1 < 8  && position[0] + 1 < 8 && boardState[position[0] + 1][position[1] + 1].taken && boardState[position[0] + 1][position[1] + 1].takenBy.color != this.color) {
            availableMoves.add(boardState[position[0] + 1][position[1] + 1]);
        }

        if (position[0] + 1 < 8  && position[0] - 1 >= 0 && boardState[position[0] - 1][position[1] + 1].taken && boardState[position[0] - 1][position[1] + 1].takenBy.color != this.color) {
            availableMoves.add(boardState[position[0] - 1][position[1] + 1]);
        }

        return availableMoves;
    }
}
