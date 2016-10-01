import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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
    public void shouldUpdateBoardWithMarkWhenPlayer1MakesMove() throws Exception {
        board.updateBoard(1, "X");
        assertEquals(listOfBoardCells.get(0), "X");
    }

    @Test
    public void shouldUpdateBoardWithMarkWhenPlayer2MakesMove() throws Exception {
        board.updateBoard(1,"O");
        assertEquals(listOfBoardCells.get(0), "O");
    }

    @Test
    public void shouldNotUpdateBoardWhenUserIsMarkingTakenLocation() throws Exception {
        listOfBoardCells = Arrays.asList("X","2","3","4","5","6","7","8","9");
        board = new Board(printStream, listOfBoardCells);
        board.updateBoard(1,"O");
        assertEquals(listOfBoardCells.get(0), "X");
    }

    @Test
    public void shouldPromptPlayerToTryAgainWhenMarkingTakenLocation() throws Exception {
        listOfBoardCells = Arrays.asList("X","2","3","4","5","6","7","8","9");
        board = new Board(printStream, listOfBoardCells);
        board.updateBoard(1, "O");
        verify(printStream).println("That location is marked, please enter an unmarked location");
    }

//    @Test
//    public void shouldContinuePromptingPlayerWhenMarkingTakenLocationUntilValidLocationIsEntered() throws Exception {
//        listOfBoardCells = Arrays.asList("X","2","3","4","5","6","7","8","9");
//        board.updateBoard(1, "O");
//        board.updateBoard(1, "O");
//        verify(printStream, atLeast(2)).println("That location is marked, please enter an unmarked location");
//    }
}