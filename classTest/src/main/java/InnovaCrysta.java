public class InnovaCrysta extends Car{

    private int carMileage;



    public InnovaCrysta(int carMileage) {
        super(false, "4");
        this.carMileage = carMileage;
    }

    @Override
    public String getMileage() {
        return "" + carMileage + "";
    }
}
