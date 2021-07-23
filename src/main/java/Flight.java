import java.util.ArrayList;

public class Flight {

    private FlightInfo flightInfo;
    private Plane plane;
    private Pilot pilot;
    private ArrayList<CabinCrew> cabinTeam;
    private ArrayList<Passenger> passengers;

    public Flight(FlightInfo flightInfo, Plane plane, Pilot pilot, ArrayList cabinTeam){
        this.flightInfo = flightInfo;
        this.plane = plane;
        this.pilot = pilot;
        this.cabinTeam = cabinTeam;
        this.passengers = new ArrayList<>();


    }
}
