import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getCapacityFromType(){
        return this.planeType.getCapacity();
    }

    public int getTotalWeight(){
        return this.planeType.getTotalWeight();
    }

    public ArrayList getSeatNumbers() {
        return planeType.getSeatNumbers();
    }
}
