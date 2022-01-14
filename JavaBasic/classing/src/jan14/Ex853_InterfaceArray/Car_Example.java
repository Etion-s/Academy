package jan14.Ex853_InterfaceArray;

public class Car_Example {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        myCar.tires[1] = new HankookTire();
        myCar.tires[2] = new HankookTire();

        myCar.run();
    }
}
