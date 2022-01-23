package Board;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {

    public Board(){
        this.setSize(800,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8,8));
        CreateBoard();
        this.setVisible(true);
    }
    void CreateBoard(){
        for (int row=0;row<8;row++){
            for (int col=0;col<8;col++) {
                Square square = new Square(row,col);
                WritePositionIndex(square);
                square.setEnabled(false);
                this.add(square);
            }
        }
    }
    void WritePositionIndex(Square square){
        for (int row=0;row<8;row++){
            for (int col=0;col<8;col++) {
                square.setText(square.getRow()+"  "+square.getCol()+"");

            }

        }
    }
}
