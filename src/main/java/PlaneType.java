public enum PlaneType {
    BOEING747(100, 10000),
    PUDDLEJUMPER(10, 2000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }
}
