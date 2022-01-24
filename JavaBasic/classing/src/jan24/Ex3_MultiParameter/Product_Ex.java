package jan24.Ex3_MultiParameter;

public class Product_Ex {
    public static void main(String[] args) {
        Product<Tv,String> product1 = new Product<>();
        product1.setKind(new Tv()); // kind는 T타입으로 선언되는데, 위 줄에서 T에 Tv타입으로 정의 되었기 때문에 파라메터로 Tv객체를
        product1.setModel("스마트 tv"); // 생성한 후 넘겨 준다
        Tv tv = product1.getkind();
        tv.display();
        String tvModel = product1.getModel();
        System.out.println(tvModel);

        Product<Car,String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("자동차");
        Car car = product2.getkind();
        car.display();
        String check2 = product2.getModel();
        System.out.println(check2);
    }
}
