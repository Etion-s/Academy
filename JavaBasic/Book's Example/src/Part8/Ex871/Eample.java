package Part8.Ex871;

public class Eample {
    public static void main(String[] args) {
        MyInterface m1 = new MyClassA();
        m1.method1();
        m1.method2();

        System.out.println("----------------");
        MyInterface m2 = new MyClassB();
        m2.method1();
        m2.method2();
    }
}
