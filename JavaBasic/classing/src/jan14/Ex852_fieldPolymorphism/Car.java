package jan14.Ex852_fieldPolymorphism;

public class Car {
    Tire F_L = new HankookTire();
    Tire F_R = new KumhoTire();
    Tire B_L = new HankookTire();
    Tire B_R = new KumhoTire();

    void run() {
        F_L.roll();
        F_R.roll();
        B_L.roll();
        B_R.roll();
    }
}
