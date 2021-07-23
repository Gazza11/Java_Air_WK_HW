import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Steve", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Steve", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger.getBags());
    }
}
