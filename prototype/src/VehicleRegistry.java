import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String, Vehicle> myVehcilesMap = new HashMap<>();
    static {
        myVehcilesMap.put("TWO", new TwoWheelerVehicle("350", 23422F,"royal", true));
        myVehcilesMap.put("FOUR", new TwoWheelerVehicle("350", 23422F,"BENZ", true));
    }

    public Vehicle getVehicle(String vehicleType) {
        return  myVehcilesMap.get(vehicleType);
    }
}
