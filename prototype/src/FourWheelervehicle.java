public class FourWheelervehicle extends Vehicle{

    private boolean isDiesel ;
    public FourWheelervehicle(String engineType, Float price, String model, boolean isDiesel) {
        super(engineType, price, model);
        this.isDiesel = isDiesel;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    protected FourWheelervehicle clone() throws CloneNotSupportedException {
        return (FourWheelervehicle) super.clone();
    }
}
