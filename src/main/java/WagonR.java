public class WagonR extends Car{

    String mileage;

    public WagonR(boolean isSedan, String seats, String mileage) {
        super(isSedan, seats);
        this.mileage = mileage;
    }

    @Override
    public String getMileage() {
        return mileage;
    }
}
