package Method_Ex3_return;

public class Car_Driver {
    public static void main(String[] args) {
        Car car = new Car();

        car.setGas(5);

        boolean gasState = car.isLeftGas();
        if(gasState){
            System.out.println("START");
            car.run();
        }

        if(car.isLeftGas()) {
            System.out.println("FUEL is FULL");
        } else{
            System.out.println("Chrage");
        }
    }
}
