package Piece;

import Board.Square;
import Game.Color;

public interface Piece {
    Color Color();
    boolean isWhite();
    void MovePosition(int row,int col);
    boolean checkLegalMove(int row,int col);
    //need arrangement for possible moves (return type or think about inside)
    Square[][] PossibleMoves();
}

