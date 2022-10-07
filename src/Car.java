public class Car {

    private int fuelEfficiency;
    private double fuelLevel;

    public Car(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = 0;
    }

    public double getFuelLevel() {
        return Math.round(fuelLevel*100.0)/100.0;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void addFuel(int fuelToAdd) {
        setFuelLevel(fuelLevel + fuelToAdd);
    }

    public void drive(int distanceInKm) {
        double usedFuel = (double)distanceInKm / fuelEfficiency;
        setFuelLevel(fuelLevel - usedFuel);
    }

}
