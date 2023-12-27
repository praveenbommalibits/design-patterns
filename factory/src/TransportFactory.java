public class TransportFactory {

    private TransportFactory() {

    }

    public static Transport getInstance(String transportType) {
        switch(transportType){
            case "ROAD":
                return new Truck();
            case "SEA":
                return new Ship();
            default:
                throw new IllegalArgumentException("No valid option provided");
        }
    }
}
