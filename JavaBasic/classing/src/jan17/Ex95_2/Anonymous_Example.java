package jan17.Ex95_2;

public class Anonymous_Example {
    public static void main(String[] args) {
        // 익명 객체 생성
        Anonymous anony = new Anonymous();

        // 필드로 생성된 익명 객체 호출
        anony.field.turnOn();
        anony.field.turnOff();

        // 지역변수로 생성된 익명 객체 호출
        anony.method1();

        // 매개값으로 생성된 익명 객체 호출
        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Phone ON");
            }

            @Override
            public void turnOff() {
                System.out.println("Phone OFF");
            }
        });
    }
}
