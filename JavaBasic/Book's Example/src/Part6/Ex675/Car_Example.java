package Part6.Ex675;

public class Car_Example {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.company);
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.maxSpeed);
        System.out.println("============================");

        Car c2 = new Car("트럭");
        System.out.println(c2.company);
        System.out.println(c2.model);
        System.out.println("============================");

        Car c3 = new Car("봉고","보라");
        System.out.println(c3.company);
        System.out.println(c3.model);
        System.out.println(c3.color);
        System.out.println("============================");

        Car c4 = new Car("그랜저", "노랑빨강", 304);
        System.out.println(c4.company);
        System.out.println(c4.model);
        System.out.println(c4.color);
        System.out.println(c4.maxSpeed);
        System.out.println("============================");
    }
}
