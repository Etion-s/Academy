package jan13.Ex_abstract;

public class Dog extends Animal{
    public Dog() {
        this.kind = "Dog";
    }

    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}
