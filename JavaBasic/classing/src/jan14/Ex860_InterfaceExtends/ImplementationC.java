package jan14.Ex860_InterfaceExtends;
// 제일하위인터페이스C 이용하는 클래스
public class ImplementationC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("methodA()");
    }

    @Override
    public void methodB() {
        System.out.println("methodB()");
    }

    @Override
    public void methodC() {
        System.out.println("methodC()");
    }
}
