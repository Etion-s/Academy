package Taxi2;

public class Taxi extends Car{
    private int charge;
    private boolean fare;
    private String company;

    public Taxi(String name){
        company = name;
    }

    public void account(){
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
        System.out.println("택시회사 이름: "+company);
        System.out.println("요금:" + charge);
        System.out.println("할증여부: "+fare);
    }


}
