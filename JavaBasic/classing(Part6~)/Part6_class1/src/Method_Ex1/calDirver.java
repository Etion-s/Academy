package Method_Ex1;

public class calDirver {
    public static void main(String[] args) {
        cal c1 = new cal();

        c1.powerOn();

        int result1 = c1.plus(5,6);
        System.out.println("두수의 합: " + result1);

        double result2 = c1.divide(10,4);
        System.out.println("두수의 나눗셈: " + result2);

        c1.powerOff();
    }
}
