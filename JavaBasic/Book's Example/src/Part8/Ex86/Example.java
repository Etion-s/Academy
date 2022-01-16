package Part8.Ex86;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();
        // ImplemeatationC는 인터페이스A와B를 상속받는 인터페이스인 인터페이스C의 구현객체
        // 이므로 impl에 인터페이스 A와B가 올수 있다.
        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();


    }
}
