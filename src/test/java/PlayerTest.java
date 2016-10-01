import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ronnie on 10/1/16.
 */
public class PlayerTest {

    private BufferedReader bufferedReader;
    private Board board;
    private Player player;
    private List<String> listOfBoardCells;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player = new Player(bufferedReader, board);
    }

    @Test
    public void shouldGetUserInputWhenUserInputsNumber() throws Exception {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Player player = new Player(bufferedReader, board);
        when(bufferedReader.readLine()).thenReturn("1");
        player.makeMove("X");
        verify(board).updateBoard(eq(1), anyString());
    }

    @Test
    public void shouldUpdateBoardWithMarkWhenPlayer1MakesMove() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        player.makeMove("X");
        verify(board).updateBoard(1, "X");
    }
}