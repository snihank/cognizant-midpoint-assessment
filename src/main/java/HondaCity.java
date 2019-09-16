public class HondaCity extends Car {
    private int carMileage;


    public HondaCity(int carMileage) {
        super(true, "4");
        this.carMileage = carMileage;
    }

    @Override
    public String getMileage() {

        return "" + carMileage + "4";
    }
}
