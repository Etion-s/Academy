package Part8.Ex872;

public interface ChildInterface2 extends ParentInterface{
    @Override
    default void method2() {
        System.out.println("자식클래스2 - method2 오버라이딩");
    }
    public void method3();
}
