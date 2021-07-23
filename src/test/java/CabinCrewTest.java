import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Jaskier", Rank.ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Jaskier", cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.ATTENDANT, cabinCrew.getRank());
    }
}
