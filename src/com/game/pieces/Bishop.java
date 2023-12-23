package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class Bishop extends Piece {
    public Bishop(Game.Color color, int[] ubication) {
        super(color, Name.Bishop, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        ArrayList<Cell> avalibleMoves = new ArrayList<>();

        //Up Right
        for (int i = 1; i < 8; i++) {
            if (position[0] + i < 8 && position[1] + i < 8) {
                if (!boardState[this.position[0] + i][this.position[1] + i].taken) {
                    avalibleMoves.add(boardState[this.position[0] + i][this.position[1] + i]);
                } else {
                    if (boardState[this.position[0] + i][this.position[1] + i].takenBy.color != this.color) {
                        avalibleMoves.add(boardState[this.position[0] + i][this.position[1] + i]);
                    }
                    break;
                }
            }
        }

        //Up Left
        for (int i = 1; i < 8; i++) {
            if (position[0] - i >= 0 && position[1] + i < 8) {
                if (!boardState[this.position[0] - i][this.position[1] + i].taken) {
                    avalibleMoves.add(boardState[this.position[0] - i][this.position[1] + i]);
                } else {
                    if (boardState[this.position[0] - i][this.position[1] + i].takenBy.color != this.color) {
                        avalibleMoves.add(boardState[this.position[0] - i][this.position[1] + i]);
                    }
                    break;
                }
            }
        }

        //Down Right
        for (int i = 1; i < 8; i++) {
            if (position[0] + i < 8 && position[1] - i >= 0) {
                if (!boardState[this.position[0] + i][this.position[1] - i].taken) {
                    avalibleMoves.add(boardState[this.position[0] + i][this.position[1] - i]);
                } else {
                    if (boardState[this.position[0] + i][this.position[1] - i].takenBy.color != this.color) {
                        avalibleMoves.add(boardState[this.position[0] + i][this.position[1] - i]);
                    }
                    break;
                }
            }
        }

        //Down Left
        for (int i = 1; i < 8; i++) {
            if (position[0] - i >= 0 && position[1] - i >= 0) {
                if (!boardState[this.position[0] - i][this.position[1] - i].taken) {
                    avalibleMoves.add(boardState[this.position[0] - i][this.position[1] - i]);
                } else {
                    if (boardState[this.position[0] - i][this.position[1] - i].takenBy.color != this.color) {
                        avalibleMoves.add(boardState[this.position[0] - i][this.position[1] - i]);
                    }
                    break;
                }
            }
        }


        return avalibleMoves;
    }
}