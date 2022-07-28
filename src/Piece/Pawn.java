package Piece;

import Game.Color;

public class Pawn extends Piece{

    boolean firstMove=true;

    public Pawn(int id,PiecePosition pos, Color color) {
        super(id,pos,color);
        if(!(this.getId()==0)){
            System.out.println("Wrong id given for a PAWN check your PAWN objects");
            return;
        }
        addPossiblePawnMoves();
    }
    //FUNCTIONS
    private void addPossiblePawnMoves(){
        if(this.getColor()==Color.WHITE && firstMove){
            this.addPossibleMoves(new PiecePosition(this.getPosition().getX()-1,this.getPosition().getY()));
            this.addPossibleMoves(new PiecePosition(this.getPosition().getX()-2,this.getPosition().getY()));
        }
        else if(this.getColor()==Color.WHITE && !firstMove){
            this.addPossibleMoves(new PiecePosition(this.getPosition().getX()-1,this.getPosition().getY()));
        }
        else if(this.getColor()==Color.BLACK && firstMove){
            this.addPossibleMoves(new PiecePosition(this.getPosition().getX()+1,this.getPosition().getY()));
            this.addPossibleMoves(new PiecePosition(this.getPosition().getX()+2,this.getPosition().getY()));
        }
        else if(this.getColor()==Color.BLACK && !firstMove){
            this.addPossibleMoves(new PiecePosition(this.getPosition().getX()+1,this.getPosition().getY()));
        }

    }
}

