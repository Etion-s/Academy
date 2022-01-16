package Part8.Ex872;

public class Child1 implements ChildInterface1{
    @Override
    public void method3() {
        System.out.println("자식인터페이스1 - method3");
    }

    @Override
    public void method1() {
        System.out.println("부모인터페이스 - method1");
    }
}
