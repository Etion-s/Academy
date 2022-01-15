package Part7.Ex772;

public class Car {
    Tire FLT = new Tire("앞왼쪽",6);
    Tire FRT = new Tire("앞오른쪽",2);
    Tire BLT = new Tire("뒤왼쪽",3);
    Tire BRT = new Tire("뒤오른쪽",4);

    int run() {
        System.out.println("자동차가 달립니다.");
        if(FLT.roll()==false) {stop(); return 1;}
        if(FRT.roll()==false) {stop(); return 2;}
        if(BLT.roll()==false) {stop(); return 3;}
        if(BRT.roll()==false) {stop(); return 4;}
        return 0;

    }

    void stop() {
        System.out.println("자동차가 멈춥니다.");
    }

}
