//유동혁_문항3
package Taxi_Test;
public class Taxi extends Car{
    private int charge;
    private boolean fare;
    private String company;

    public Taxi(String company) {
        this.company = company;
    }

    public void accounts(){
        if (fare){
            charge = speed*12;
        } else {
            charge = speed*10;
        }
    }
    public void setFare(boolean fare) {
        this.fare = fare;
    }

    @Override
    public void display() {
        System.out.println("택시회사이름: "+company);
        System.out.println("요금: "+charge);
        System.out.println("할증여부: "+fare);

    }
}