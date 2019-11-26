import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer(1);
    }

    @Test
    public void canGetNumberOfCDs(){
        cdPlayer.getNumberOfCDs();
        assertEquals(1, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canPlay(){
        cdPlayer.play();
        assertEquals("Now playing", cdPlayer.play());
    }
}
