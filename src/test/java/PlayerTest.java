import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ronnie on 10/1/16.
 */
public class PlayerTest {

    @Test
    public void shouldGetUserInputWhenUserInputsNumber() throws Exception {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Player player = new Player(bufferedReader);
        when(bufferedReader.readLine()).thenReturn("1");
        assertEquals(player.makeMove(), 1);
    }


}