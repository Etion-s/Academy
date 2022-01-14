package jan14.Ex871_DefaultMethod;

public class MyClassB implements MyInterface{
    @Override
    public void method1() {
        System.out.println("B - method1()");
    }

    @Override
    public void method2() {
        System.out.println("[new] B - method2()");
    }
}
