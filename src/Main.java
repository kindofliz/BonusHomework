public class Main {
    public static void main(String[] args) {

        Car myHybrid = new Car(30); // 30 km per litre

        myHybrid.addFuel(20); // Tank 20 litres
        System.out.println("Total amount of fuel in the tank after filling up: " + myHybrid.getFuelLevel() + " litres");

        myHybrid.drive(100); // Drive 100 km
        System.out.println("Remaining fuel: " + myHybrid.getFuelLevel() + " litres"); //Print fuel remaining

        myHybrid.drive(100); // Drive 100 km more
        System.out.println("Remaining fuel: " + myHybrid.getFuelLevel() + " litres"); //Print fuel remaining

    }
}