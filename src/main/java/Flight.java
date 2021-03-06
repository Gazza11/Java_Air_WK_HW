import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
        if(getAvailableSeats() != 0){
            passengers.add(passenger);
            assignSeatNumber(passenger);
            passenger.changeOnFlightStatus();
        }

    }

    public int totalCurrentBaggage(){
        int total = 0;
        for(int i = 0; i < passengers.size(); i++){
            total += passengers.get(i).getBags();
        }
        return total;
    }

    public void assignSeatNumber(Passenger passenger){
        int intRandom = 0 + (int)(Math.random() * ((getAvailableSeats() - 0) + 1));
        if(intRandom >= 0){
            String seat = plane.getSeatNumbers().remove(intRandom).toString();
            passenger.setSeatNumber(seat);
        }

    }
}
