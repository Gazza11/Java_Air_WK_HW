public enum PlaneType {
    BOEING747(400, 10000), // Capacity = seats,
    PUDDLEJUMPER(10, 200);

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
