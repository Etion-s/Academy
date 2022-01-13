public class Car_Driver {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i=0; i<=5; i++){
            int problemlocation = car.run();

            switch (problemlocation){
                case 1:
                    System.out.println("앞왼쪽 한국타이어로 교체");
                    car.flt = new HankookTire("앞왼쪾",15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타이어로 교체");
                    car.frt = new KumhoTire("앞오른쪽",13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타이어로 교체");
                    car.blt = new HankookTire("앞왼쪾",14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타이어로 교체");
                    car.brt = new KumhoTire("뒤오른쪽",17);
                    break;
            }
            System.out.println("----------회전중----------");
        }
    }
}
