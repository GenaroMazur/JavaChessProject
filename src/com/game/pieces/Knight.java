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

        int[] xs = {position[0] + 2, position[0] + 2, position[0] - 2, position[0] - 2, position[0] + 1, position[0] - 1, position[0] + 1, position[0] - 1};
        int[] ys = {position[1] + 1, position[1] - 1, position[1] + 1, position[1] - 1, position[1] + 2, position[1] + 2, position[1] - 2, position[1] - 2};

        for (int i = 0; i < 8; i++) {
            if (xs[i] >= 0 && xs[i] < 8 && ys[i] >= 0 && ys[i] < 8) {
                if (!boardState[xs[i]][ys[i]].taken || boardState[xs[i]][ys[i]].takenBy.color != this.color) {
                    avalibleMoves.add(boardState[xs[i]][ys[i]]);
                }
            }
        }

        return avalibleMoves;
    }
}