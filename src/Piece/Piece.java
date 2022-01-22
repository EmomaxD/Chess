package Piece;

import Board.Position;
import Game.Color;

public interface Piece {
    Color Color(Color color);
    boolean isWhite();
    Position[][] Position(Position[][] Position);
    Position[][] MovePosition(Position[][] MovePosition);


}

