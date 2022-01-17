package jan17.Ex95_2;

import java.rmi.Remote;

public class Anonymous {
    // 필드
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Tv ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv OFF");
        }

    };

    // 로컬 변수
    void method1() {
        RemoteControl locolVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio ON");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio OFF");
            }
        };
        locolVar.turnOn();
        locolVar.turnOff();
    }

    // 매개값
    void method2(RemoteControl rc){
        rc.turnOn();
    }
}
