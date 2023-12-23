package com.game.pieces;

import com.game.Cell;
import com.game.Game;
import com.game.Piece;

import java.util.ArrayList;

public class Queen extends Piece {
    public Queen(Game.Color color, int[] ubication) {
        super(color, Name.Queen, ubication);
    }

    @Override
    public ArrayList<Cell> moves(Cell[][] boardState) {
        ArrayList<Cell> avalibleMoves = new ArrayList<>();

        //Up Right
        for (int i = this.position[0]; i + this.position[0] < 8 && i + this.position[1] < 8; i++) {
            if (!boardState[this.position[0] + i][this.position[1] + i].taken) {
                avalibleMoves.add(boardState[this.position[0] + i][this.position[1] + i]);
            } else {
                if (boardState[this.position[0] + i][this.position[1] + i].takenBy.color != this.color) {
                    avalibleMoves.add(boardState[this.position[0] + i][this.position[1] + i]);
                }
                break;
            }
        }

        //Down Right
        for (int i = this.position[0]; i + this.position[0] < 8 && this.position[1] - i >= 0; i++) {
            if (!boardState[this.position[0] + i][this.position[1] - i].taken) {
                avalibleMoves.add(boardState[this.position[0] + i][this.position[1] - i]);
            } else {
                if (boardState[this.position[0] + i][this.position[1] - i].takenBy.color != this.color) {
                    avalibleMoves.add(boardState[this.position[0] + i][this.position[1] - i]);
                }
                break;
            }
        }

        //Down Left
        for (int i = this.position[0]; this.position[0] - i >= 0 && this.position[1] - i >= 0; i++) {
            if (!boardState[this.position[0] - i][this.position[1] - i].taken) {
                avalibleMoves.add(boardState[this.position[0] - i][this.position[1] - i]);
            } else {
                if (boardState[this.position[0] - i][this.position[1] - i].takenBy.color != this.color) {
                    avalibleMoves.add(boardState[this.position[0] - i][this.position[1] - i]);
                }
                break;
            }
        }

        //Up Left
        for (int i = this.position[0]; this.position[0] - i >= 0 && this.position[1] + i < 8; i++) {
            if (!boardState[this.position[0] - i][this.position[1] + i].taken) {
                avalibleMoves.add(boardState[this.position[0] - i][this.position[1] + i]);
            } else {
                if (boardState[this.position[0] - i][this.position[1] + i].takenBy.color != this.color) {
                    avalibleMoves.add(boardState[this.position[0] - i][this.position[1] + i]);
                }
                break;
            }
        }
//Right
        for (int i = this.position[0] + 1; i < 8; i++) {
            Cell cell = boardState[i][this.position[1]];
            if (!cell.taken) {
                avalibleMoves.add(cell);
            } else {
                if (cell.takenBy.color != this.color) {
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
                if (cell.takenBy.color != this.color) {
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
                if (cell.takenBy.color != this.color) {
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
                if (cell.takenBy.color != this.color) {
                    avalibleMoves.add(cell);
                }
                break;
            }
        }
        return null;
    }
}