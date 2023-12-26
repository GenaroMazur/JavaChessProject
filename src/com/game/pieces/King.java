package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class King extends Piece {
    public King(Game.Color color, int[] ubication) {
        super(color, Name.King, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        ArrayList<Cell> availableMoves = new ArrayList<>();

        int[] xs = {this.position[0] + 1, this.position[0] + 1, this.position[0] + 1, this.position[0], this.position[0] - 1, this.position[0] - 1, this.position[0] - 1, this.position[0]};
        int[] ys = {this.position[1] + 1, this.position[1], this.position[1] - 1, this.position[1] - 1, this.position[1] - 1, this.position[1], this.position[1] + 1, this.position[1] + 1};

        for (int i = 0; i < 8; i++) {
            if (ys[i] >= 0 && ys[i] < 8 && xs[i] >= 0 && xs[i] < 8 && !boardState[xs[i]][ys[i]].taken) {
                availableMoves.add(boardState[xs[i]][ys[i]]);
            }
        }

        Cell rook1 = boardState[0][this.position[1]];
        Cell rook2 = boardState[7][this.position[1]];
        if (!wasMove) {
            if (rook1.taken && rook1.takenBy.name == Name.Rook && !rook1.takenBy.wasMove) {
                if (!boardState[5][this.position[1]].taken && !boardState[6][this.position[1]].taken) {
                    availableMoves.add(boardState[6][this.position[1]]);
                }
            }
            if (rook2.taken && rook2.takenBy.name == Name.Rook && !rook2.takenBy.wasMove) {
                if (!boardState[1][this.position[1]].taken && !boardState[2][this.position[1]].taken && !boardState[3][this.position[1]].taken) {
                    availableMoves.add(boardState[2][this.position[1]]);
                }
            }

        }

        return availableMoves;
    }
}