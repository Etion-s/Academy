package Car_Ex;

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.company);
        System.out.println(c1.model);
        System.out.println(c1.color);
    }
}
/*여기 클래스에서는 "현대자동차, 그랜저, 검점"이라는 문자열이 없지만
* Car클래스에 저장되어있다. 따라서 나는 여기서 c1이라는 이름으로 Car객체를 사용하고
* Car객체에 저장되어있는 company, model, color 필드를 사용할수있다*/