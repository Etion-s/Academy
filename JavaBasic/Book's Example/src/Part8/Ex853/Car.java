package Part8.Ex853;

public class Car { // 초기값으로 내차에는 한국타이어를 사용중
    Tire[] tires = {
            new HankookTIre(),
            new HankookTIre(),
            new HankookTIre(),
            new HankookTIre()
    };

    void run() {
        for (Tire tire : tires) {
            tire.roll();
        }
    }

}
