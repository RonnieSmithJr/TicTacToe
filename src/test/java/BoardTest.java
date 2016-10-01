import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ronnie on 9/30/16.
 */
public class BoardTest {
    PrintStream printStream;
    Board board;
    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
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