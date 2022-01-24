package Taxi2;

public class Car {
    protected int speed;
    protected String name;

    public Car(){
        this.speed = 0;
        this.name = null;
    }
    public Car(String name) {
        this.name = null;
    }

    public void speedUp(){
        speed++;
    }
    public void speedDown(){
        speed--;
    }
    public void stop(){
        speed = 0;
    }
    public void display() {
        System.out.println("모델명: "+name+ " | 속도: "+speed);
    }
}
