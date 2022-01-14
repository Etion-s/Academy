package jan14.Ex852_fieldPolymorphism;

public class Car_Example {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        myCar.F_R = new HankookTire();
        myCar.B_R = new HankookTire();

        myCar.run();
    }
}
