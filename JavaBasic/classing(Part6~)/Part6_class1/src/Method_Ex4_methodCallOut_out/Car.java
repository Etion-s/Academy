package Method_Ex4_methodCallOut_out;

public class Car {
    int speed;

    int getSpeed(){
        return speed;
    }

    void keyTurnOn(){
        System.out.println("Ready To Move");
    }

    void run() {
        for (int i=10; i<=50; i+=10){
            speed = i;
            System.out.println("RUN (NowSpeed: "+speed+")");
        }
    }

}
