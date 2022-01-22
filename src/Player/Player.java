package Player;

public interface Player {
    boolean isCheckmate();
    boolean isStalemate();
    boolean isLegalMove();
    boolean isAllowedCastle();
}
