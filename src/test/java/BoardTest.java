import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ronnie on 9/30/16.
 */
public class BoardTest {
    private PrintStream printStream;
    private List<String> listOfBoardCells;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        listOfBoardCells = Arrays.asList("1","2","3","4","5","6","7","8","9");;
        board = new Board(printStream, listOfBoardCells);
    }

    @Test
    public void shouldDraw3x3GridWhenGameStarts() throws Exception {
        board.draw();
        verify(printStream).println("1|2|3\n" +
                                    "-----\n" +
                                    "4|5|6\n" +
                                    "-----\n" +
                                    "7|8|9");

    }

    @Test
    public void shouldUpdateBoardWhenPlayerMakesMove() throws Exception {
        board.updateBoard(1, "X");
        verify(printStream).println("X|2|3\n" +
                                    "-----\n" +
                                    "4|5|6\n" +
                                    "-----\n" +
                                    "7|8|9");

    }
}