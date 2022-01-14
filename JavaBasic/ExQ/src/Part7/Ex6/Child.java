package Part7.Ex6;

public class Child extends Parent{
    private String name;

    public Child(){
        //super() <- 1번으로도착
        this("you"); //<-8번도착
        System.out.println("Child() CALL"); //<- 12번 도착 및 4번출력
    }

    public Child(String name){ // <- 9번도착, "you"라는 값을 가지고
        //super(String name)은 왜 안하는가? > 밑에 참조
        // 그리고 이것은 반드시 생성자를 만들어야한다. 왜냐면 Parent클래스에서 이런 모양을 만들었으므
        this.name = name; // <-10번도착 및 3번실행
        System.out.println("Child(String name) CALL"); // 11번 도착 및 3번출력
    }
}
/* 문제해석
1. 자식객체의 생성자를 호출 하면 컴파일러가 자동으로 부모 객체의 생성자를 생성한다
2. 자식클래스는 반드시 부모클래스의 객체를 한번이라도 생성해야 사용가능하다
3. 자식클래스의 생성자와 부모클래스의 생성자가 동일해야한다 (파라메터 까지)
호출해준다
* 질문해석
Child()에서 생략된 super()를 통해서 이미 부모클래스를 생성했으므로 Child(String name)은 부모
클래스의 생성자와 동일하게 만들어주면 된다
즉 위에서 이미 부모클래스의 주소를 참조(=동일 heap영역)하므로 가능하다
*/
