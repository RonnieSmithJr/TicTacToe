import java.io.PrintStream;

/**
 * Created by ronnie on 9/30/16.
 */
public class Game {
    private Board board;
    private PrintStream printStream;

    public Game(Board board, Player player, PrintStream printStream) {
        this.board = board;
        this.printStream = printStream;
    }

    public void start() {
        board.draw();
        printStream.println("Please input a number 1-9");
    }
}
