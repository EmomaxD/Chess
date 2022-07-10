package Piece;

import Game.Color;
import java.util.ArrayList;
import java.util.List;

public class Piece{
    private int id,point;
    private String name;
    private boolean canMove=true;
    private Color color;
    private final List<Object> PossibleMoves=new ArrayList<>();

    private PiecePosition position;

    public Piece(){

    }

    public Piece(int id,PiecePosition pos,Color color){
        if(id<0 || id>5){
            System.out.println("Wrong id given for piece please check your piece objects");
            return;
        }
        this.setId(id);
        this.position=pos;
        this.setColor(color);
        this.setPoint();
        this.setName();
    }

    void Move(int xPosition,int yPosition){
        this.setPosition(new PiecePosition(xPosition,yPosition));
    }

    public void LogPiece(){
        System.out.println("ID : "+this.getId());
        System.out.println("Name : "+this.getName());
        System.out.println("Point : "+this.getPoint());
        System.out.println("Row : "+this.getPosition().getX());
        System.out.println("Col : "+this.getPosition().getY());
        System.out.println("Color : "+this.getColor());
    }
    private void setName(){
        switch (id){
            case 0:
                this.setName("Pawn");
                break;
            case 1:
                this.setName("Knight");
                break;
            case 2:
                this.setName("Bishop");
                break;
            case 3:
                this.setName("Rook");
                break;
            case 4:
                this.setName("Queen");
                break;
            case 5:
                this.setName("King");
                break;
            default:
                System.out.println("Wrong id given for a piece");
                break;
        }
    }
    private void setPoint(){
        switch (id){
            case 0:
                this.setPoint(1);
                break;
            case 1:
            case 2:
                this.setPoint(3);
                break;
            case 3:
                this.setPoint(5);
                break;
            case 4:
                this.setPoint(9);
                break;
            case 5:
                this.setPoint(-1);
                break;
            default:
                System.out.println("Wrong id given for a piece");
                break;
        }
    }
    public void addPossibleMoves(Object move){
        PossibleMoves.add(move);
    }
    public void deletePossibleMoves(Object move){
        PossibleMoves.remove(move);
    }
    public void LogAllPossibleMoves(){
        System.out.println("Possible Moves : " + PossibleMoves);
        System.out.println("Possible moves size : "+PossibleMoves.size());
    }
    public Object GetPossibleMove(int index){
        return this.PossibleMoves.get(index);
    }

    //GETTER SETTER
    public void setPosition(PiecePosition pPosition){
        this.position=pPosition;
    }
    public PiecePosition getPosition(){
        return this.position;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanMove() {return canMove;}

    public void setCanMove(boolean canMove) {this.canMove = canMove;}

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
