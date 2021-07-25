public class Passenger extends Person{

    private int bags;
    private boolean onFlight;

    public Passenger(String name, int bags){
        super(name);
        this.bags = bags;
        this.onFlight = false;
    }

    public int getBags(){
        return this.bags;
    }

    public boolean onFlightStatus(){
        return this.onFlight;
    }
}
