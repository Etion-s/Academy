package Part7.Ex783;

public abstract class Phone {
    public String owner;

    public Phone(String owner){
        this.owner = owner;
    }

    public void on() {
        System.out.println("ON");
    }
    public void off() {
        System.out.println("OFF");
    }
}
