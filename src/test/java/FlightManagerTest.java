import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;

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
        flightManager = new FlightManager(flight);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
    }

    @Test
    public void hasFlight(){
        assertEquals(flight, flightManager.getFlight());
    }

    @Test
    public void hasCapacityFromPlane(){
        assertEquals(10, flightManager.getCapacityOfFlight());
    }

    @Test
    public void hasTotalWeightForBags(){
        assertEquals(100, flightManager.getTotalWeightForBags());
    }

    @Test
    public void hasBaggageReservePerPerson(){
        assertEquals(10, flightManager.BaggageReservePerPassenger());
    }

    @Test
    public void hasTotalBaggageCurrentlyReserved(){
        assertEquals(10, flightManager.totalCurrentBaggage());
    }

    @Test
    public void hasRemainingBaggageCapacity(){
        assertEquals(90, flightManager.baggageWeightRemaining());
    }

    @Test
    public void stressTestBookings(){
        flight.bookPassenger(passenger2);
        System.out.println(passenger2.getSeatNumber());
        flight.bookPassenger(passenger2);
        System.out.println(passenger2.getSeatNumber());
        flight.bookPassenger(passenger2);
        System.out.println(passenger2.getSeatNumber());
        flight.bookPassenger(passenger2);
        System.out.println(passenger2.getSeatNumber());
        flight.bookPassenger(passenger2);
        System.out.println(passenger2.getSeatNumber());
        flight.bookPassenger(passenger2);
        System.out.println(passenger2.getSeatNumber());
        flight.bookPassenger(passenger2);
        System.out.println(passenger2.getSeatNumber());
        flight.bookPassenger(passenger2);
        System.out.println(passenger2.getSeatNumber());
        assertEquals(26, flightManager.baggageWeightRemaining());
        assertEquals(10, flightManager.getPassengersOnFlight().size());
        System.out.println(passenger2.getSeatNumber());
        assertEquals(0, flightManager.getFlight().getAvailableSeats());
    }

}
