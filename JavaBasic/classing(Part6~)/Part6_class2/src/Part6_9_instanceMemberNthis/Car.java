package Part6_9_instanceMemberNthis;

public class Car {
    String model;
    int speed;

    Car(String moedel){
        this.model = moedel;
    }

    void setSpeed (int speed){
        this.speed = speed;
    }

    void run() {
        for (int i=10; i<=50; i+=10){
            setSpeed(i);
            System.out.println("RUN! "+model+ " "+speed);
        }
    }
}
