public enum FlightInfo {
    FR756("LAX", "EDI", "05/08/2022"),
    AZ997("JFK", "HTW", "22/06/2021");

    private final String destination;
    private final String departure;
    private final String departureDate;

    FlightInfo(String destination, String departure, String departureDate) {
        this.destination = destination;
        this.departure = departure;
        this.departureDate = departureDate;
    }

    public String getDestination(){
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureDate() {
        return departureDate;
    }
}
