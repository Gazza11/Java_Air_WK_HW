public class Pilot extends Person{

    private String pilotID;
    private Rank rank;

    public Pilot(String name, Rank rank, String pilotID){
        super(name);
        this.rank = rank;
        this.pilotID = pilotID;
    }

    public Rank getRank(){
        return this.rank;
    }

    public String getPilotID(){
        return this.pilotID;
    }

}
