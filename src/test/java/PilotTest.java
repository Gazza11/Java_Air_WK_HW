import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Chris", Rank.CAPTAIN, "LI1212");
    }

    @Test
    public void hasName(){
        assertEquals("Chris", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasPilotID(){
        assertEquals("LI1212", pilot.getPilotID());
    }
}
