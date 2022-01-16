package Part8.Ex872;

public class Example {
    public static void main(String[] args) {
        ChildInterface1 c1 = new Child1(); //Parent인터페이스로 받으면 자동 형봔으로인해 method3 사용 x
        c1.method1();
        c1.method2();
        c1.method3();
    }
}
