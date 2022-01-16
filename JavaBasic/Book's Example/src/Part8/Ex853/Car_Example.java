package Part8.Ex853;

public class Car_Example {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        System.out.println("바퀴고장");

        car.tires[1] = new KumhoTIre();

        car.run();
    }
}
