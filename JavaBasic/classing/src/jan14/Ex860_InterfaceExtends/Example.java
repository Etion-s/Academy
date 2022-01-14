package jan14.Ex860_InterfaceExtends;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA iA = impl;
        iA.methodA(); // iA=InterfaceA변수는 A()만가능
        System.out.println();

        InterfaceB iB = impl;
        iB.methodB(); // iA=InterfaceB변수는 A()만가능
        System.out.println();

        InterfaceC iC = impl;
        iC.methodA();
        iC.methodB();
        iC.methodC();
        System.out.println();
    }
}
