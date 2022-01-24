//유동혁_문항3
package Taxi_Test;

public class Taxi_Example {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("서울택시");

        taxi.setFare(true);
        taxi.speedUp();
        taxi.speedUp();
        taxi.accounts();
        taxi.display();
    }
}