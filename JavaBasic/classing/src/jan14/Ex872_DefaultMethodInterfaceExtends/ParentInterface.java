package jan14.Ex872_DefaultMethodInterfaceExtends;

public interface ParentInterface {
    public void method1();
    public default void method2() {
        System.out.println("method2 = default");
    }
}
