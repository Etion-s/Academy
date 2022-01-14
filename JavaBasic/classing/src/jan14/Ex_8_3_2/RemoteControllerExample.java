package jan14.Ex_8_3_2;

import jan14.Ex84_InterfaceHowToUse.RemoteControl;

public class RemoteControllerExample {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("ON");
            }

            @Override
            public void turnOff() {
                System.out.println("OFF");
            }

            @Override
            public void setVolume(int volume) {

            }
        } ;
    }
}
// RemoteControl인터페이스의 구현객체 없이 바로 사용가능
