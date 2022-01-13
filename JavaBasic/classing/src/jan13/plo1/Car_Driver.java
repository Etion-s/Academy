package jan13.plo1;

public class Car_Driver {
    public static void main(String[] args) {
        Car car = new Car();

        for(int i=0; i<5; i++){ // 단순히 자동차를 몇번 굴릴것이냐 > 즉 펑크문을 보기 위함
            int problemLocation = car.run(); // 1번해석

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 / 한국타이어 교체");
                    car.tires[0] = new HankookTire("앞왼쪽",15); // 2번해석
                    break;
                case 2:
                    System.out.println("앞오른쪽 / 금호타이어 교체");
                    car.tires[1] = new KumhoTire("앞오른쪽",13); // 2번해석
                    break;
                case 3:
                    System.out.println("뒤왼쪽 / 한국타이어 교체");
                    car.tires[2] = new HankookTire("뒤왼쪽",14); // 2번해석
                    break;
                case 4:
                    System.out.println("뒤오른쪽 / 금호타이어 교체");
                    car.tires[3] = new KumhoTire("뒤오른쪽",17); // 2번해석
                    break;
            }
            System.out.println("-----------RUNNING-----------");
        }

    }
}
/*
1번해석
* Car클래스에서 tires 변수를 Tire타입의 배열로 정의했다
  그리고 run()메소드에서는 for문을 통해 각 배열에 들어 가있는 값들을 조사하는데
  만약 Tire의roll()이 false 가 되면 해당 for문의 i+1의 값(=펑크타이어자리)를 반환 한다

2번해석
    car클래스에서 tires는 Tire인 객체를 4개 생성하는 곳을 담는 배열이다.
    Tire클래스에서 생성자는 기본 생성자가 아닌 반드시 파라메터 2개를 받아야하는데
    그래서 new HankookTire()생성자를 할때 파라메터 2개를 반드시 넘겨준다
    이떄 Tire가 아닌 HankookTire의 객체를 사용해도 되는 이유는 Tire의 자식클래스 이기 때문이다.
 */