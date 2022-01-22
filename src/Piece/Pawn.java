package Piece;

import Board.Position;
import Game.Color;

public class Pawn extends Position implements Piece{

    private Color color;

    public Pawn(int row,int col,Color color){
        this.setRow(row);
        this.setCol(col);
        this.color=color;

    }

    @Override
    public boolean isWhite() {
        return color==Color.WHITE;
    }

    @Override
    public Position[][] Position(Position[][] Position) {
        return new Position[getRow()][getCol()];
    }
    @Override
    public Color Color(Color color){
     return this.color;
    }
    @Override
    public Position[][] MovePosition(Position[][] MovePosition){
        return MovePosition;
    }

    public void setColor(Color color){
        this.color=color;
    }
}
