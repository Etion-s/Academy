package jan14.Ex872_DefaultMethodInterfaceExtends;

public interface ChildInterfaceB extends ParentInterface{
    @Override
    default void method2() {
        System.out.println("[chage by B] method2 = default");
    }

    public void method3();
}
