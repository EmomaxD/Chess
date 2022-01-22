package Game;

import Board.Board;
import Piece.Pawn;

public class Game{
    Board[][] board = new Board[8][8];

    void CreatePieces(){
        for (int i=0;i< board.length;i++){
            Pawn pawn = new Pawn(1,i,Color.WHITE);
        }
    }
}

