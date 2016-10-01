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
        printStream.println("Please input a number 1-9");
        int location = player.makeMove();
        board.updateBoard(location, "X");
        board.draw();
    }
}
