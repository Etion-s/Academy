package jan13.plo5;

public class Dog extends Animal{
    public Dog() {
        this.kind = "Dog";
    }

    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}
