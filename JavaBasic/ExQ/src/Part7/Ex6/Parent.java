package Part7.Ex6;

public class Parent {
    public String nation;

    public Parent() { // <- 2번도착
        this("Korea"); // <-3번도착
        System.out.println("Parent() CALL"); // <-7번도착 및 2번 출력
    }

    public Parent(String nation) { //<- 4번도착, nation은 "korea"값을 가지고
        this.nation = nation; // <-5번도착 및 1번실행
        System.out.println("Parent(String nation) CALL"); // <-6번도착 및  1번 출력
    }
}
