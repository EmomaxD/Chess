package Board;

import Game.Color;
import Piece.Piece;
import Piece.Pawn;
import javax.swing.*;
import java.awt.*;

public class Board extends JFrame{
    Piece[][] piece=new Piece[8][8];

    public Board(){
        initPawns();
        piece[6][6].LogPiece();
        piece[6][6].LogAllPossibleMoves();
        GUI();
    }
    public void initPawns() {
        for (int i = 0; i < piece.length; i++) {
            piece[6][i] = new Pawn(0, 6, i, Color.WHITE);
            piece[1][i] = new Pawn(0, 1, i, Color.BLACK);
        }
    }

    private void GUI(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setTitle("Chess");
        this.setLayout(new GridLayout(8,8));
        CreateBoard();
        this.setVisible(true);
    }

    private void CreateBoard(){
        for (int row=0;row<piece.length;row++){
            for (int col=0;col<piece[0].length;col++) {
                break;
            }

        }
    }
}

