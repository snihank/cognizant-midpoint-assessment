public class WagonR extends Car{

    private int mileage;

    public WagonR(int mileage) {
        super(false, "6");
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return "" + mileage + "kml";
    }
}
