import java.util.ArrayList;
import java.util.Arrays;

public enum PlaneType {
    PUDDLEJUMPER(10, 200, new ArrayList<String>( Arrays.asList("A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3", "C4"))),

    BOEING747(400, 10000, new ArrayList<String>( Arrays.asList("A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3", "C4"))); // Capacity = seats,


    private final int capacity;
    private final int totalWeight;
    private final ArrayList<String> seatNumbers;


    PlaneType(int capacity, int totalWeight, ArrayList seatNumbers){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
        this.seatNumbers = seatNumbers;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }

    public ArrayList getSeatNumbers(){
        return seatNumbers;
    }
}
