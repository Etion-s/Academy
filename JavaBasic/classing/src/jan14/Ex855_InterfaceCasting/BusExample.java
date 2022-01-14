package jan14.Ex855_InterfaceCasting;

public class BusExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare() -> 이미 Vehicle인터페이스로 자동변환이 이루어졌고, 거기에는 해당 메소드가 x

        Bus bus = (Bus) vehicle; // 강제형변환
        ((Bus) vehicle).checkFare();
    }
}
