package Game;

public enum Color {
    WHITE,BLACK;
    public Color Oppenent(){
        return this == WHITE ? BLACK : WHITE;
    }
}
