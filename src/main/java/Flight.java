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

    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    public Plane getPlane() {
        return plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrew> getCabinTeam() {
        return cabinTeam;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getPassengerCount(){
        return passengers.size();
    }

    public String getDestinationInfo(){
        return flightInfo.getDestination();
    }

    public String getDepartureInfo(){
        return flightInfo.getDeparture();
    }

    public String getDepartureDateInfo(){
        return flightInfo.getDepartureDate();
    }

    public int getAvailableSeats(){
        return (plane.getCapacityFromType() - passengers.size());
    }

    public void bookPassenger(Passenger passenger) {
        passengers.add(passenger);
        
    }
}
