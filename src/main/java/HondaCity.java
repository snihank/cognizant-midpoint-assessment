public class HondaCity extends Car {
    String carMileage;


    public HondaCity(boolean isSedan, String seats, String carMileage) {
        super(isSedan, seats);
        this.carMileage = carMileage;
    }

    @Override
    public String getMileage() {

        return carMileage;
    }
}
