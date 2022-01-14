package jan14.Ex856_InterfaceInstanceof;


// 매개변수의 인터페이스화 aka 인터페이스 사용 부분
public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();// vechicle을 Bus타입으로 casting
        }
        vehicle.run();
    }
}
