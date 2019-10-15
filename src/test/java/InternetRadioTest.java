import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {
    private InternetRadio internetRadio;

    @Before
    public void before() {
        internetRadio = new InternetRadio("BBC Scotland");
    }

    @Test
    public void canTune() {
        internetRadio.tune("Forth 1");
        assertEquals("Forth 1", internetRadio.getStation());
    }
}
