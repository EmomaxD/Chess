package Piece;

import Game.Color;

public class Pawn extends Piece{

    boolean firstMove=true;

    public Pawn(int id, int row, int col, Color color) {
        super(id,row, col, color);

      if(!(this.getId()==0)){
            System.out.println("Wrong id given for a PAWN check your PAWN objects");
            return;
        }
        addPossiblePawnMoves();
    }
    //FUNCTIONS
    private void addPossiblePawnMoves(){
        if(this.getColor()==Color.WHITE && firstMove){
            this.addPossibleMoves("["+(this.getX()-1)+"]["+this.getY()+"]");
            this.addPossibleMoves("["+(this.getX()-2)+"]["+this.getY()+"]");
        }
        else if(this.getColor()==Color.WHITE && !firstMove){
            this.addPossibleMoves("["+(this.getX()-1)+"]["+this.getY()+"]");
        }
        else if(this.getColor()==Color.BLACK && firstMove){
            this.addPossibleMoves("["+(this.getX()+1)+"]["+this.getY()+"]");
            this.addPossibleMoves("["+(this.getX()+2)+"]["+this.getY()+"]");
        }
        else if(this.getColor()==Color.BLACK && !firstMove){
            this.addPossibleMoves("["+(this.getX()+1)+"]["+this.getY()+"]");
        }

    }
}

