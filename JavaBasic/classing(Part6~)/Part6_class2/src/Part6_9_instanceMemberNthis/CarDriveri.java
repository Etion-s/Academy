package Part6_9_instanceMemberNthis;

public class CarDriveri {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car youCar = new Car("제네시스");

        myCar.run();
        youCar.run();
    }
}
