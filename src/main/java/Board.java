import java.io.PrintStream;
import java.util.List;

/**
 * Created by ronnie on 9/30/16.
 */
public class Board {
    private PrintStream printStream;
    private List<String> listOfBoardCells;

    public Board(PrintStream printStream, List<String> listOfBoardCells) {

        this.printStream = printStream;
        this.listOfBoardCells = listOfBoardCells;
    }

    public void draw() {
        printStream.println(listOfBoardCells.get(0)+ "|"+listOfBoardCells.get(1)+"|"+listOfBoardCells.get(2)+"\n" +
                            "-----\n" +
                listOfBoardCells.get(3)+ "|"+listOfBoardCells.get(4)+"|"+listOfBoardCells.get(5)+"\n" +
                            "-----\n" +
                listOfBoardCells.get(6)+ "|"+listOfBoardCells.get(7)+"|"+listOfBoardCells.get(8));
    }

    public void updateBoard(int location, String mark) {
            listOfBoardCells.set(location - 1, mark);
    }

    public boolean isLocationTaken(int location) {
        if (listOfBoardCells.get(location - 1).equals("X") || listOfBoardCells.get(location - 1).equals("O")) {
            return true;
        } else {
            return false;
        }
    }
}
