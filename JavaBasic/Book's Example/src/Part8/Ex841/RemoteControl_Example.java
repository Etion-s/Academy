package Part8.Ex841;

public class RemoteControl_Example {
    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);
        System.out.println("=============");

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);
    }
}
