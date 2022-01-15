package Part7.Ex774;

public class Driver_Example {
    public static void main(String[] args) {
        Driver d1= new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        d1.drive(bus);
        d1.drive(taxi);
    }


}
