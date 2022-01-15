package Part6.Ex614;

public class Car_Example {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(100);
        System.out.println("Car Speed: " + car.getSpeed());
        if(!car.isStop()){
            car.setStop(true);
        }
        System.out.println("Car Speed: " + car.getSpeed());
    }
}
