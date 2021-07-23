import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    Pilot pilot1;

    CabinCrew crew1;
    CabinCrew crew2;
    CabinCrew crew3;
    CabinCrew crew4;

    ArrayList<CabinCrew> cabinTeam;

    @Before
    public void before(){
        plane = new Plane(PlaneType.PUDDLEJUMPER);
        pilot1 = new Pilot("Chris", Rank.CAPTAIN, "LI1212");
        crew1 = new CabinCrew("Jaskier", Rank.ATTENDANT);
        crew2 = new CabinCrew("Triss", Rank.ATTENDANT);
        cabinTeam = new ArrayList<>();
        cabinTeam.add(crew1);
        cabinTeam.add(crew2);
        flight = new Flight(FlightInfo.FR756, plane, pilot1, cabinTeam);
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.PUDDLEJUMPER, flight.getPlane());
    }

    @Test
    public void hasPilot(){
        assertEquals("Chris," flight.getPilot());
    }

    @Test
    public void hasCabinTeam(){
        assertEquals(2, flight.getCabinTeam().size());
    }

    @Test
    public void hasDestination(){
        assertEquals("LAX", flight.getDestination());
    }

    @Test
    public void hasDeparture(){
        assertEquals("EDI", flight.getDeparture());
    }

    @Test
    public void hasDepartureDate(){
        assertEquals("05/08/2022", flight.getDepartureDate());
    }
}
