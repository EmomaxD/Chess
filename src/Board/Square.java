package Board;

import Piece.Piece;

import javax.swing.*;

public class Square extends JButton {
    private int row,col;
    private Piece piece;
    public Square(int row,int col){
        this.row=row;
        this.col=col;
    }
    public Square(int row,int col,Piece p){
        this.row=row;
        this.col=col;
        this.piece=p;
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
}
