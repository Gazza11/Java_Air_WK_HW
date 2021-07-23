public class CabinCrew extends Person{

    private Rank rank;

    public CabinCrew(String name, Rank rank){
        super(name);
        this.rank = rank;
    }

    public Rank getRank(){
        return rank;
    }

    public String relayMessage(){
        return "I have a message for you.";
    }
}
