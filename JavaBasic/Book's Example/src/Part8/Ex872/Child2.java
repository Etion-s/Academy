package Part8.Ex872;

public class Child2 implements ChildInterface2{
    @Override
    public void method3() {
        System.out.println("자식인터페이스2 - method3");
    }

    @Override
    public void method1() {
        System.out.println("부모인터페이스 - method1");
    }
}
