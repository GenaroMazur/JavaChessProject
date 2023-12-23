package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class Rook extends Piece {
    public Rook(Game.Color color, int[] ubication) {
        super(color, Name.Rook, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        ArrayList<Cell> avalibleMoves = new ArrayList<>();

        //Right
        for (int i = this.position[0] + 1; i < 8; i++) {
            Cell cell = boardState[i][this.position[1]];
            if (!cell.taken) {
                avalibleMoves.add(cell);
            } else {
                if (cell.takenBy.color != this.color){
                    avalibleMoves.add(cell);
                }
                break;
            }
        }

        //Left
        for (int i = this.position[0] - 1; i >= 0; i--) {
            Cell cell = boardState[i][this.position[1]];
            if (!cell.taken) {
                avalibleMoves.add(cell);
            } else {
                if (cell.takenBy.color != this.color){
                    avalibleMoves.add(cell);
                }
                break;
            }
        }

        //Up
        for (int i = this.position[1] + 1; i < 8; i++) {
            Cell cell = boardState[this.position[0]][i];
            if (!cell.taken) {
                avalibleMoves.add(cell);
            } else {
                if (cell.takenBy.color != this.color){
                    avalibleMoves.add(cell);
                }
                break;
            }
        }

        //Down
        for (int i = this.position[1] - 1; i >= 0; i--) {
            Cell cell = boardState[this.position[0]][i];
            if (!cell.taken) {
                avalibleMoves.add(cell);
            } else {
                if (cell.takenBy.color != this.color){
                    avalibleMoves.add(cell);
                }
                break;
            }
        }

        return avalibleMoves;
    }
}