package jan13.plo5;

public class Cat extends Animal{
    public Cat() {
        this.kind = "Cat";
    }

    @Override
    public void sound() {
        System.out.println("냥냥!");
    }
}
