import java.io.PrintStream;

/**
 * Created by ronnie on 9/30/16.
 */
public class Game {
    private Board board;
    private Player player;
    private PrintStream printStream;

    public Game(Board board, Player player, PrintStream printStream) {
        this.board = board;
        this.player = player;
        this.printStream = printStream;
    }

    public void start() {
        board.draw();
        printStream.println("Player 1: Please input a number 1-9");
        player.makeMove("X");
        board.draw();
        printStream.println("Player 2: Please input a number 1-9");
        player.makeMove("O");
        board.draw();
    }
}
