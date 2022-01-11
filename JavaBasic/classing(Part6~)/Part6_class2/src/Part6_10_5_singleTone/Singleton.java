package Part6_10_5_singleTone;

public class Singleton {
    // 정적필드
    private static Singleton singleton = new Singleton();

    // 생성자
    private Singleton() {}

    // 정적 메소드
    static Singleton getInstance() { // 반환되는 타입이 Singleton 이다
        return singleton;
    }
}
