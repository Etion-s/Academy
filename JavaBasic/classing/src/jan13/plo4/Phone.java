package jan13.plo4;

public abstract class Phone {
    // 필드
    public String owner;

    // 생성자
    public Phone(String owner) {
        this.owner = owner;
    }

    // method
    public void turnOn() {
        System.out.println("Turn ON");
    }

    public void turnOff() {
        System.out.println("Turn Off");
    }
}
