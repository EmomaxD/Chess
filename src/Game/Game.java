package Game;

import Piece.Pawn;

public class Game{
    public Game(){

        //White Pawn
        Pawn WhitePawn = new Pawn(1,0,Color.WHITE);
        Pawn WhitePawn1 = new Pawn(1,1,Color.WHITE);
        Pawn WhitePawn2 = new Pawn(1,2,Color.WHITE);
        Pawn WhitePawn3 = new Pawn(1,3,Color.WHITE);
        Pawn WhitePawn4 = new Pawn(1,4,Color.WHITE);
        Pawn WhitePawn5 = new Pawn(1,5,Color.WHITE);
        Pawn WhitePawn6 = new Pawn(1,6,Color.WHITE);
        Pawn WhitePawn7 = new Pawn(1,7,Color.WHITE);

        //Black pawn
        Pawn BlackPawn = new Pawn(6,0,Color.BLACK);
        Pawn BlackPawn1 = new Pawn(6,1,Color.BLACK);
        Pawn BlackPawn2 = new Pawn(6,2,Color.BLACK);
        Pawn BlackPawn3 = new Pawn(6,3,Color.BLACK);
        Pawn BlackPawn4 = new Pawn(6,4,Color.BLACK);
        Pawn BlackPawn5 = new Pawn(6,5,Color.BLACK);
        Pawn BlackPawn6 = new Pawn(6,6,Color.BLACK);
        Pawn BlackPawn7 = new Pawn(6,7,Color.BLACK);

        BlackPawn3.LogObject();


    }
}

