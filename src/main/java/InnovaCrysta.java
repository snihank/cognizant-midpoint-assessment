public class InnovaCrysta extends Car{

    String carMileage;



    public InnovaCrysta(boolean isSedan, String seats, String carMileage) {
        super(isSedan, seats);
        this.carMileage = carMileage;
    }

    @Override
    public String getMileage() {
        return carMileage;
    }
}