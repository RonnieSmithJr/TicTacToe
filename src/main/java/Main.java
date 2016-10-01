import java.io.PrintStream;

/**
 * Created by ronnie on 9/30/16.
 */
public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        Player player = new Player();
        Game game = new Game(board, player, printStream);
        game.start();
    }
}
