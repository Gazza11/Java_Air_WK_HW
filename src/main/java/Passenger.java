public class Passenger extends Person{

    private int bags;
    private boolean onFlight;
    private String seatNumber;

    public Passenger(String name, int bags){
        super(name);
        this.bags = bags;
        this.onFlight = false;
        this.seatNumber = "";
    }

    public int getBags(){
        return this.bags;
    }

    public boolean onFlightStatus(){
        return this.onFlight;
    }

    public void changeOnFlightStatus(){
            onFlight = !onFlight;
    }

    public String getSeatNumber(){
        return seatNumber;
    }

    public void setSeatNumber(String newSeatNumber) {
        seatNumber = newSeatNumber;
    }
}
