package jan13.Ex_abstract;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("Breathing....");
    }

    public abstract void sound();
}
