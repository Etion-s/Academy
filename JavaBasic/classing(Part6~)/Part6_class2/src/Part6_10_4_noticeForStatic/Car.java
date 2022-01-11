package Part6_10_4_noticeForStatic;

public class Car {
    int speed; //인스턴스

    void run(){
        System.out.println(speed+" RUN!");
    }

    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.speed = 60;
        mycar.run();
    }
}
