/*
package Part6_10_4_noticeForStatic;

public class ClassName {
    //인스턴스 필드와 메소드
    int field1;
    void method1(){
        System.out.println("hello");
    }

    //정적 필드와 메소드
    static int field2;
    static void method2(){
        System.out.println("HI");
    }

    //정적블록
    static {
        field2 = 10; // 실행o
        method2(); // o
        field1 = 10; // 실행x
        method1() // x
    }
    static void method3(){
        this.field1 = 10; // this사용x
        method1(); // x
    }

    // 사용방법
    static void method4() {
        ClassName myName = new ClassName(); // 객체생성후 사용가능
        myName.field1 = 10;
        myName.method1();
    }
}*/
