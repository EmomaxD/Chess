package Piece;

import Game.Color;

public class Pawn extends Piece{
    public Pawn(int id,int row, int col, Color color) {
        super(id,row, col, color);
        if(!(this.getId()==0)){
            System.out.println("Wrong id given for a PAWN check your PAWN objects");
            return;
        }
    }
}
