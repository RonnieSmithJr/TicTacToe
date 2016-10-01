import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by ronnie on 9/30/16.
 */
public class Player {
    private BufferedReader bufferedReader;

    public Player(BufferedReader bufferedReader) {

        this.bufferedReader = bufferedReader;
    }

    public int makeMove() {

        String location = "1";
        try {
            location = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(location);
    }
}
