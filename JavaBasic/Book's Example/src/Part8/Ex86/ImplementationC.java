package Part8.Ex86;

public class ImplementationC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("인터페이스C를 이용클래스(ImplementationC)에서 A실행");
    }

    @Override
    public void methodB() {
        System.out.println("인터페이스C를 이용클래스(ImplementationC)에서 B실행");


    }

    @Override
    public void methodC() {
        System.out.println("인터페이스C를 이용클래스(ImplementationC)에서 C실행");


    }
}
