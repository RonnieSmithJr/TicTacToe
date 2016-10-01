import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ronnie on 9/30/16.
 */
public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        List<String> listOfBoardCells = Arrays.asList("1","2","3","4","5","6","7","8","9");
        Board board = new Board(printStream, listOfBoardCells);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Player player = new Player(bufferedReader, board);
        Game game = new Game(board, player, printStream);
        game.start();
    }
}
