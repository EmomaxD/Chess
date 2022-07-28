package Game;

import Board.Board;

public class Game{
    public Game(){
        Start();
    }
    void Start(){
        new Board().MakeBoard();
    }
}

