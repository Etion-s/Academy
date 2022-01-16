package Part8.Ex852;

public class Car { // 초기값으로 내차에는 한국타이어를 사용중
    Tire FLT = new HankookTIre();
    Tire FRT = new HankookTIre();
    Tire BLT = new HankookTIre();
    Tire BRT = new HankookTIre();

    void run() {
        System.out.println("====바퀴====");
        FLT.roll();
        FRT.roll();
        BLT.roll();
        BRT.roll();
    }

}
