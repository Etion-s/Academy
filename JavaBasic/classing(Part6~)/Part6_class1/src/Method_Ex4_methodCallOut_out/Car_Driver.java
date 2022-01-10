package Method_Ex4_methodCallOut_out;

public class Car_Driver {
    public static void main(String[] args) {
        Car car = new Car();
        car.keyTurnOn();
        car.run();
        int speed = car.getSpeed();
        System.out.println("현재속도: "+speed);
    }
}
