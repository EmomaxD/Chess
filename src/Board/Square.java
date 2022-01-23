package Board;

import javax.swing.*;

public class Square extends JButton {
    private int row,col;
    private boolean isFree=true;

    public Square(int row, int col){
        this.row=row;
        this.col=col;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
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
}
