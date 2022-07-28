package Board;

import Piece.Piece;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square extends JButton implements ActionListener {
    private int row,col;
    private Piece piece;
    private int clickCount=0;



    public Square(int row, int col){
        this.row=row;
        this.col=col;
        this.addActionListener(e->{
            if(clickCount%2==0){

                //this.setBorder(BorderFactory.createBevelBorder(1, java.awt.Color.red, java.awt.Color.red));
                clickCount++;
                //System.out.println(piece.GetPossibleMove(0));

                for(int i=0;i<piece.getPossibleMoves().size();i++){
                    new Board().paintPossibleMoves(piece.GetPossibleMove(i).getX(),piece.GetPossibleMove(i).getY());
                }
            }
            else{
                for(int i=0;i<piece.getPossibleMoves().size();i++){
                    new Board().paintPossibleMoves(piece.GetPossibleMove(i).getX(),piece.GetPossibleMove(i).getY());
                }
                clickCount++;
            }
        });
    }
    public Square(int row,int col,Piece p){
        this.row=row;
        this.col=col;
        this.piece=p;

        this.addActionListener(e->{
            if(clickCount%2==0){
                this.setBorder(BorderFactory.createBevelBorder(1, java.awt.Color.red, java.awt.Color.red));
                System.out.println("%2=0 clickCount : "+clickCount);
                clickCount++;
            }
            else{
                this.setBorder(null);
                System.out.println("%2!=0 clickCount : "+clickCount);
                clickCount++;
            }

        });
    }

    //GETTER SETTER

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
