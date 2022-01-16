package Part8.Ex852;

public class Car_Example {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        System.out.println("바퀴고장");

        car.FLT = new KumhoTIre(); // 같은 Tire인터페이스 이기 때문에 교체 가능

        car.run();
    }
}
