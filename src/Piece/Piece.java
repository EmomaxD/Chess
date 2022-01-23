package Piece;
import Game.Color;

public abstract class Piece {
    private int id,point,row,col,PossibleRow,PossibleCol;
    private String name;
    private boolean canMove;
    private Color color;


    public Piece(int id,int row,int col,Color color){
        if(id<0 || id>5){
            System.out.println("Wrong id given for piece please check your piece objects");
            return;
        }
        this.setId(id);
        this.setRow(row);
        this.setCol(col);
        this.setColor(color);
        setPoint();
        setName();
        LogPiece();
    }
    public void LogPiece(){
        System.out.println("ID : "+this.getId());
        System.out.println("Name : "+this.getName());
        System.out.println("Point : "+this.getPoint());
        System.out.println("Row : "+this.getRow());
        System.out.println("Col : "+this.getCol());
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

    //GETTER SETTER
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

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
