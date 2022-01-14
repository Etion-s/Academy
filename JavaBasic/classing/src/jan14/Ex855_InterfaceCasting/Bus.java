package jan14.Ex855_InterfaceCasting;
// 구현객체 및 인터페이스 이용 객체
public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus GO");
    }

    public void checkFare() {
        System.out.println("Check FEE");
    }
}
