class Car extends Vehicle{
    private double milesDriven;
    private  double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    double calculateFuelEfficiency() {
        double fuelEfficiency=milesDriven/fuelConsumed;
        return fuelEfficiency;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(milesDriven+" "+ fuelConsumed);
    }
}