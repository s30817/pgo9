class Truck extends Vehicle {
    private double milesDriven;
    private double fuelConsumed;
    private double cargoWeight;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    double calculateFuelEfficiency() {
        double fuelEfficiency=milesDriven/(fuelConsumed)+(cargoWeight*0.5);
        return fuelEfficiency;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(milesDriven+" "+fuelConsumed+" "+cargoWeight);
    }
}