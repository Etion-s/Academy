package Part7.ExQ.Ex7;

public class SnowTire_Example {
    public static void main(String[] args) {
        SnowTire s1 = new SnowTire();
        Tire tire = s1;

        s1.run(); // 스노우타이거 굴러감
        tire.run(); // 스노우타이어 굴러감
    }

}
