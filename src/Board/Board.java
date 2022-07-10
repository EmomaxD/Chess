package Board;

import Game.Color;
import Piece.Piece;
import Piece.PiecePosition;
import Piece.Pawn;
import javax.swing.*;
import java.awt.*;

public class Board extends JFrame{
    Square[][] square=new Square[8][8];

    public Board(){
        GUI();
        square[6][6].getPiece().LogPiece();
        square[6][6].getPiece().LogAllPossibleMoves();
        paintBoard();
    }
    protected void paintBoard(){
        for(int i=0;i< square.length;i++){
            for(int j=0;j<square[0].length;j++){
                if(i%2==0){
                    if(j%2==0){
                        square[i][j].setBackground(java.awt.Color.white);
                        square[i][j].setOpaque(true);
                    }
                    else{
                        square[i][j].setBackground(java.awt.Color.orange);
                    }
                }
                else{
                        square[i][j].setBackground(java.awt.Color.orange);
                        square[i][j].setOpaque(true);
                        if(j%2!=0){
                            square[i][j].setBackground(java.awt.Color.white);
                        }

                }



            }
        }

    }
    public void initPawns() {
        for (int i = 0; i < square.length; i++) {
            square[6][i].setPiece(new Pawn(0,new PiecePosition(6,i), Color.WHITE));
            square[1][i].setPiece(new Pawn(0,new PiecePosition(1, i), Color.BLACK));
        }
    }

    private void GUI(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setResizable(false);
        this.setTitle("Chess");
        this.setLayout(new GridLayout(8,8));
        CreateBoard();
        this.setVisible(true);
    }

    private void CreateBoard(){
        for (int row=0;row<square.length;row++){
            for (int col=0;col<square[0].length;col++) {
                Square sq=new Square(row,col);
                this.add(sq);
                square[row][col]=sq;


            }

        }
        initPawns();
        for (int i=0;i<square.length;i++){
            if(square[6][i].getPiece().getId()==0){
                square[6][i].setText("P");
            }
            if(square[1][i].getPiece().getId()==0){
                square[1][i].setText("P");
            }

        }
    }
}

