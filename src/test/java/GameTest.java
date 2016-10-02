import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by ronnie on 9/30/16.
 */


public class GameTest {

    Board board;
    Game game;
    private Player player1;
    private Player player2;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new Game(board, player1, player2, printStream);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts() throws Exception {
        game.start();
        verify(board, atLeast(1)).draw();
    }

    @Test
    public void shouldPromptUserToMakeMoveAfterBoardIsPrinted() throws Exception {
        game.start();
        verify(printStream).println("Player 1: Please input a number 1-9");
    }

    @Test
    public void shouldCaptureDesiredLocationWhenPlayer1InputsNumber() throws Exception {
        game.start();
        verify(player1).makeMove();
    }

    @Test
    public void shouldPromptUserToMakeMoveAfterOtherPlayerCompletesMove() throws Exception {
        game.start();
        verify(printStream).println("Player 2: Please input a number 1-9");
    }

    @Test
    public void shouldCaptureDesiredLocationWhenPlayer2InputsNumber() throws Exception {
        game.start();
        verify(player2).makeMove();
    }
}
