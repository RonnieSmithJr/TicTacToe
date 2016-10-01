import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by ronnie on 9/30/16.
 */
public class Player {
    private BufferedReader bufferedReader;
    private Board board;

    public Player(BufferedReader bufferedReader, Board board) {
        this.bufferedReader = bufferedReader;
        this.board = board;
    }

    public void makeMove(String mark) {
        String location = "1";
        try {
            location = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int indexToUpdate = Integer.parseInt(location);
        board.updateBoard(indexToUpdate,mark);
    }
}
