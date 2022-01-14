package jan14.Ex856_InterfaceInstanceof;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus GO");
    }
    public void checkFare() {
        System.out.println("Check Fare!");
    }
}
