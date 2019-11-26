import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("", "Sony", "12");
    }

    @Test
    public void canTune(){
        radio.tune("Radio 1");
        assertEquals("Radio 1", radio.getStation());
    }

    @Test
    public void canPlay(){
        assertEquals("Now playing", radio.play());
    }
}
