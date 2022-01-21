package Taxi;

public class Taxi_Example {
    public static void main(String[] args) {
        Taxi t1 = new Taxi("서울택시");

        t1.setFare(true);

        t1.speedUp();
        t1.speedUp();
        t1.accounts();
        t1.display();
    }
}
