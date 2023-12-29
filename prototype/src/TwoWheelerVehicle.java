public class TwoWheelerVehicle extends Vehicle {
    boolean isElectric;
    public TwoWheelerVehicle(String engineType, Float price, String model, Boolean isElectric) {
        super(engineType, price, model);
        this.isElectric = isElectric;
    }



    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    protected TwoWheelerVehicle clone()  throws CloneNotSupportedException {
        return (TwoWheelerVehicle) super.clone();
    }
}
