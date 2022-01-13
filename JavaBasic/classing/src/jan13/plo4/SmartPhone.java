package jan13.plo4;

public class SmartPhone extends Phone{
    //생성자 <- super를 통해서 부모 생성자 호출
    public SmartPhone(String owner){
        super(owner);
    }

    // method
    public void internetSearch() {
        System.out.println("Searching....");
    }
}
