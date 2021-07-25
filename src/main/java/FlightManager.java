import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public Flight getFlight(){
        return this.flight;
    }

    public int getCapacityOfFlight(){
        return this.flight.getPlane().getCapacityFromType();
    }

    public int getTotalWeightForBags(){
        return (this.flight.getPlane().getTotalWeight() / 2);
    }

    public int BaggageReservePerPassenger(){
        return (getTotalWeightForBags() / getCapacityOfFlight());
    }

    public ArrayList<Passenger> getPassengersOnFlight(){
        return flight.getPassengers();
    }

    public int totalCurrentBaggage(){
        return flight.totalCurrentBaggage();
    }

    public int baggageWeightRemaining(){
        return getTotalWeightForBags() - totalCurrentBaggage();
    }
}
