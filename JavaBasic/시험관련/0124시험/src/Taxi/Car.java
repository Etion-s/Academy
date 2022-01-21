package Taxi;

public class Car {
    protected int speed;
    protected String name;

    public Car(){
        speed = 0;
        name = null;
    }
    public Car(String name){
        this.name = name;
    }

    public void speedUp(){
        speed+=1;
    }
    public void speedDown(){
        speed--;
    }
    public void stop(){
        speed = 0;
    }
    public void display(){
        System.out.println("이름: "+name+" | 속력: "+speed);
    }
}
