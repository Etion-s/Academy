package jan14.Ex853_InterfaceArray;

public class Car {
    Tire[] tires = {
            new KumhoTire(),
            new KumhoTire(),
            new KumhoTire(),
            new KumhoTire(),
    };

    void run() {
        for (Tire tire : tires){
            tire.roll();
        }
    }
}
