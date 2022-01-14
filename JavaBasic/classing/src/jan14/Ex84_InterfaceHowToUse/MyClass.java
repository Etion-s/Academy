package jan14.Ex84_InterfaceHowToUse;

public class MyClass {
    // 개발 코드에서의 인터페이스 선언가능 부분
    RemoteControl rc = new Television(); // 클래스의 필드로 선언

    MyClass(RemoteControl rc) {
        this.rc = rc;
        // 매개변수 rc의 사용 (다른 객체에서 사용시를 가정)
        // MyClass mc = new MyClass(new Televison());
        // > TV의 객체의 주소를 MyClass 생성할떄 인자로 전달
        //   가능이유는 TV가 Remote의 구현객체이기 때문이다.
        //   그리고 이것은 다형성을 뜻한다
    }

    void methodA() {
        RemoteControl rc = new Audio(); // 로컬변수 가능
    }

    void methodB (RemoteControl rc) {}
    // 매개변수 rc의 자리에 new Audio()처럼 구현객체 삽입 가능
}
