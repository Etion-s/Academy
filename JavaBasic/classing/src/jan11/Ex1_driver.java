package jan11;

public class Ex1_driver {
    public static void main(String[] args) {
        Ex1 e1 = new Ex1();

        System.out.println("현재속도: " + e1.getSpeed());

        e1.setSpeed(-200);
        System.out.println("현재속도: " + e1.getSpeed());
        if (!e1.isStop()){
            e1.setStop(true);
        }
        System.out.println("현재속도: " + e1.getSpeed());
    }
}
