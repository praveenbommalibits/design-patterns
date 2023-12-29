public abstract class Vehicle implements Cloneable{
    String engineType;
    Float price;

    String model;

    public Vehicle(String engineType, Float price, String model) {
        this.engineType = engineType;
        this.price = price;
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    protected Vehicle clone() throws CloneNotSupportedException{
        return (Vehicle) super.clone();
    }
}
