import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ronnie on 9/30/16.
 */
public class BoardTest {


    @Test
    public void shouldDraw3x3GridWhenGameStarts() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Board board = new Board(printStream);
        board.draw();
        verify(printStream).println("1|2|3\n" +
                                    "-----\n" +
                                    "4|5|6\n" +
                                    "-----\n" +
                                    "7|8|9");

    }
}