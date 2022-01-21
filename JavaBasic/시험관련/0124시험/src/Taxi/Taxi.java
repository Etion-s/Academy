package Taxi;

public class Taxi extends Car{
    private int charge;
    private boolean fare;
    private String company;


    public Taxi(String company) {
        super();
        this.company = company;
    }

    public void accounts() {
        if (fare){
            charge = speed*12;
        } else {
            charge = speed*10;
        }
    }

    public void setFare(boolean fare) {
        this.fare = fare;
    }

    public void display(){
        System.out.println(company +" | "+charge+" | "+fare);
    }
}
