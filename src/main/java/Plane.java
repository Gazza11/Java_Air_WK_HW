public class Plane {

    private PlaneType planeType;
    private int totalWeight;

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

    public void addBags(int bags) {
//        if(planeType.getCapacity() < ())
        this.totalWeight += bags;
    }
}
