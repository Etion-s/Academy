package jan13.plo5;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("Breathing...");
    }

    public abstract void sound(); // 추상메소드
}
