import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ronnie on 9/30/16.
 */
public class Player {
    private BufferedReader bufferedReader;
    private Board board;
    private PrintStream printStream;

    public Player(BufferedReader bufferedReader, Board board, PrintStream printStream) {
        this.bufferedReader = bufferedReader;
        this.board = board;
        this.printStream = printStream;
    }

    public void makeMove(String mark) {
        String location = "1";
        try {
            location = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int indexToUpdate = Integer.parseInt(location);
        if(board.isLocationTaken(indexToUpdate)){
            printStream.println("This location is taken, please enter a valid location");
        }
        else{
            board.updateBoard(indexToUpdate,mark);
        }

    }
}
