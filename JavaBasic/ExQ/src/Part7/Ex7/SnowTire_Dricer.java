package Part7.Ex7;

public class SnowTire_Dricer {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire; // tire는 SnowTire클래스의 인스턴스 변수인 snowTier 이다

        snowTire.run();
        tire.run();
        /*chageTire(new SnowTire());
        chageTire(new Tire());*/
    }
    /*public static void chageTire(Tire tire){
        tire.run();
    }*/
}
/* 문제 해석
1. 자식클래스에서 메소드를 오버라이딩하면, 그 메소드가 자식클래스는 물론이고, 부모 클래스까지 적용된다

* 배운개념적용(주석처리된부분)
- 메소드의 다형성
    Tire객체를 매개변수로 받고, 이 매개변수의 객체를 자기 객체 및 자기의 자식객체를 사용해서
    결과값을 다양하게 했다*/