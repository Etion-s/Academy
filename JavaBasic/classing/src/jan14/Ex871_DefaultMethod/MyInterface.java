package jan14.Ex871_DefaultMethod;

public interface MyInterface {
    public void method1();
    public default void method2() {
        System.out.println("MyInterFace - method2()");
    }
}
