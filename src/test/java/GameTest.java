import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by ronnie on 9/30/16.
 */


public class GameTest {

    Board board;
    Game game;
    private Player player;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        player = mock(Player.class);
        game = new Game(board, player, printStream);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts() throws Exception {
        game.start();
        verify(board).draw();
    }

    @Test
    public void shouldPromptUserToMakeMoveAfterBoardIsPrinted() throws Exception {
        game.start();
        verify(printStream).println("Player 1: Please input a number 1-9");
    }

    @Test
    public void shouldCaptureDesiredLocationWhenPlayer1InputsNumber() throws Exception {
        game.start();
        verify(player).makeMove();
    }


    @Test
    public void shouldDrawBoardWhenUserMakesMove() throws Exception {
        game.start();
        player.makeMove();
        verify(board,times(2)).draw();
    }

    @Test
    public void shouldPromptUserToMakeMoveAfterOtherPlayerCompletesMove() throws Exception {
        game.start();
        verify(printStream).println("Player 2: Please input a number 1-9");
    }

    @Test
    public void shouldCaptureDesiredLocationWhenPlayer2InputsNumber() throws Exception {
        game.start();
        verify(player, times(2)).makeMove();
    }
}
