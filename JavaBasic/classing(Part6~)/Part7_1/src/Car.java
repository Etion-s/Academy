public class Car {
    Tire flt = new Tire("앞왼쪽",6);
    Tire frt = new Tire("앞오즌쪽",2);
    Tire blt = new Tire("뒤왼쪽",3);
    Tire brt = new Tire("뒤오른쪽",4);

    int run(){
        System.out.println("Car Run");
        if(flt.roll() == false) {stop(); return 1;}
        if(frt.roll() == false) {stop(); return 2;}
        if(blt.roll() == false) {stop(); return 3;}
        if(brt.roll() == false) {stop(); return 4;}
        return 0;
    }

    void stop() {
        System.out.println("Car Stop");
    }

}
