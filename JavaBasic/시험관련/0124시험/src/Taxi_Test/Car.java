//유동혁_문항3
package Taxi_Test;

public class Car {
    protected int speed;
    protected String name;

    public Car(){
        this.speed = 0;
        this.name = null;
    }
    public Car(String name){
        this.name = name;
    }

    public void speedUp() {speed++;}
    public void speedDown() {speed--;}
    public void stop() {speed = 0;}
    public void display() {
        System.out.println("자동차 이름: "+name);
        System.out.println("자동차 속도: "+speed);
    }
}