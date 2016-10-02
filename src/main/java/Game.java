import java.io.PrintStream;

/**
 * Created by ronnie on 9/30/16.
 */
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player player;
    private PrintStream printStream;

    public Game(Board board, Player player1, Player player2, PrintStream printStream) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.printStream = printStream;
    }

    public void start() {
        board.draw();
        printStream.println("Player 1: Please input a number 1-9");
        player1.makeMove();
        board.draw();
        printStream.println("Player 2: Please input a number 1-9");
        player2.makeMove();
        board.draw();
    }
}
