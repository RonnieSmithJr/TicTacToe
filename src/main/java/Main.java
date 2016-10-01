import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by ronnie on 9/30/16.
 */
public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player player = new Player(bufferedReader);
        Game game = new Game(board, player, printStream);
        game.start();
    }
}
