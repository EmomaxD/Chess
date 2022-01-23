package Piece;

import Board.Square;
import Game.Color;

public class Pawn extends Square implements Piece{

    private Color color;
    private Square position = new Square(this.getRow(),this.getCol());
    private Square MovePosition;

    public Pawn(int row, int col, Color color){
        super(row,col);
        this.setRow(row);
        this.setCol(col);
        this.color=color;
        this.setFree(false);
    }
    public void LogObject(){
        System.out.println("Row : "+getRow());
        System.out.println("Col : "+getCol());
        System.out.println("Color :"+Color());
        System.out.println("Position Free : "+isFree());
        System.out.println("Is White : "+isWhite());
    }

    @Override
    public boolean isWhite() {
        return this.color==Color.WHITE;
    }
    @Override
    public Color Color(){
     return this.color;
    }
    @Override
    public void MovePosition(int row,int col){
        if(checkLegalMove(row,col)){
            this.setRow(row);
            this.setCol(col);
        }
        else{
            System.out.println("The move is not legal");
        }
    }

    @Override
    public Square[][] PossibleMoves() {

        //There is many of possible moves retype the function
        return new Square[this.getRow()+1][this.getCol()];
    }

    public boolean checkLegalMove(int row, int col){
        //Check is destination free

        //return object is wrong , it should be return the destination's isFree();
        MovePosition=new Square(row,col);
        return MovePosition.isFree();
    }

    public Square getPosition() {
        return this.position;
    }

    public void setPosition(Square position) {
        this.position = position;
    }
}
