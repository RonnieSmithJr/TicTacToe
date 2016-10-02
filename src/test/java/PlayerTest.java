import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

/**
 * Created by ronnie on 10/1/16.
 */
public class PlayerTest {

    private BufferedReader bufferedReader;
    private Board board;
    private Player player;
    private List<String> listOfBoardCells;
    private PrintStream printStream;
    private String mark;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        mark = "X";
        player = new Player(bufferedReader, board, printStream, mark);
    }

    @Test
    public void shouldGetUserInputWhenUserInputsNumber() throws Exception {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Player player = new Player(bufferedReader, board, printStream,mark);
        when(bufferedReader.readLine()).thenReturn("1");
        player.makeMove();
        verify(board).updateBoard(eq(1), anyString());
    }

    @Test
    public void shouldUpdateBoardWithMarkWhenPlayer1MakesMove() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        mark = "X";
        player = new Player(bufferedReader, board, printStream, mark);
        player.makeMove();
        verify(board).updateBoard(1, "X");
    }

    @Test
    public void shouldCheckIfLocationIsTakenWhenPlayerMakesMove() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        mark = "X";
        player = new Player(bufferedReader, board, printStream, mark);
        player.makeMove();
        verify(board).isLocationTaken(1);
    }

    @Test
    public void shouldPromptPlayerWhenPlayerTriesToMarkTakenLocation() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        when(board.isLocationTaken(1)).thenReturn(true);
        mark = "X";
        player = new Player(bufferedReader, board, printStream, mark);
        player.makeMove();
        verify(printStream).println("This location is taken, please enter a valid location");
    }

    @Test
    public void shouldNotUpdateBoardWhenPlayerTriesToMarkTakenLocation() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        when(board.isLocationTaken(1)).thenReturn(true);
        mark = "X";
        player = new Player(bufferedReader, board, printStream, mark);
        player.makeMove();
        verify(board, times(0)).updateBoard(anyInt(), anyString());
    }

    @Test
    public void shouldUpdateBoardWhenPlayerTriesToMarkOpenLocation() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        when(board.isLocationTaken(1)).thenReturn(false);
        mark = "X";
        player = new Player(bufferedReader, board, printStream, mark);
        player.makeMove();
        verify(board).updateBoard(anyInt(), anyString());
    }

    @Test
    @Ignore
    public void shouldContinueToPromptPlayerToEnterInputWhenPlayerTriesToMarkTakenLocation() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1", "2");
        when(board.isLocationTaken(anyInt())).thenReturn(true, false);
        mark = "X";
        player = new Player(bufferedReader, board, printStream, mark);

        player.makeMove();

        verify(board).updateBoard(2,mark);
    }
}