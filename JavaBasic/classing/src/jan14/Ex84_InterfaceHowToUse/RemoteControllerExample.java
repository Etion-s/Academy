package jan14.Ex84_InterfaceHowToUse;

public class RemoteControllerExample {
    public static void main(String[] args) {
        /*RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();*/ // 인터페이스 사용방법 책.ver
        RemoteControl rc = new Television(); // 나는 메뉴판에 있는 메뉴를 주문하면
        rc.turnOn();
        rc.setMute(true);
        System.out.println("=====================");

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);
        System.out.println("=====================");

        RemoteControl.changeBattery();
    }
}
