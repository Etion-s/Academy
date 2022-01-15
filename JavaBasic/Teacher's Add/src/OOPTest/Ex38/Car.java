package OOPTest.Ex38;

public class Car {
    protected int speed;
    protected String name;

    Car() {
        speed =0;
        name = "null";
    }
    Car(String name) {
        this.name = name;
    }

    public void speedUp(){
        this.speed++;
    }
    public void speedDown() {
        this.speed--;
    }
    public void stop() {
        this.speed = 0;
    }
    public void display() {
        System.out.println(this.name + " " + this.speed);
    }
}
