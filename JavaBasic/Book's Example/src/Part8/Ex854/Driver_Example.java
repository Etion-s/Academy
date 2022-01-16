package Part8.Ex854;

public class Driver_Example {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.drive(new Bus());
        driver.drive(new Taxi());
    }
}
