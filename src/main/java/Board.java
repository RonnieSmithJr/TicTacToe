import java.io.PrintStream;

/**
 * Created by ronnie on 9/30/16.
 */
public class Board {
    private PrintStream printStream;

    public Board(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void draw() {
        printStream.println("1|2|3\n" +
                            "-----\n" +
                            "4|5|6\n" +
                            "-----\n" +
                            "7|8|9");
    }

    public void updateBoard(int location, String mark) {
        printStream.println("X|2|3\n" +
                            "-----\n" +
                            "4|5|6\n" +
                            "-----\n" +
                            "7|8|9");
    }
}
