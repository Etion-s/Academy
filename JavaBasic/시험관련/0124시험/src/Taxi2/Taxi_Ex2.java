package Taxi2;

public class Taxi_Ex2 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("서울택시");

        taxi.speedUp();
        taxi.speedUp();
        taxi.setFare(true);
        taxi.account();
        taxi.display();
    }
}
