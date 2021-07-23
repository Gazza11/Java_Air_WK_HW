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

    Passenger passenger1;
    Passenger passenger2;

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
        passenger1 = new Passenger("Niellan", 2);
        passenger2 = new Passenger("Keira", 8);
    }

    @Test
    public void hasFlightInfo(){
        assertEquals(FlightInfo.FR756, flight.getFlightInfo());
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.PUDDLEJUMPER, flight.getPlane().getPlaneType());
    }

    @Test
    public void hasPilot(){
        assertEquals("Chris", flight.getPilot().getName());
    }

    @Test
    public void hasCabinTeam(){
        assertEquals(2, flight.getCabinTeam().size());
    }

    @Test
    public void hasDestination(){
        assertEquals("LAX", flight.getDestinationInfo());
    }

    @Test
    public void hasDeparture(){
        assertEquals("EDI", flight.getDepartureInfo());
    }

    @Test
    public void hasDepartureDate(){
        assertEquals("05/08/2022", flight.getDepartureDateInfo());
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void returnsAvailableSeats(){
        assertEquals(10, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassengerOnFlight(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getPassengerCount());
        assertEquals(9, flight.getAvailableSeats());

    }
}
