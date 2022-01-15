package OOPTest.Ex38;

public class Taxi extends Car{
    private int charge;
    private boolean fare; // 할증여부 // boolean초기값 false
    private String company;


    Taxi(String company){
        this.company = company;
    }

    public void accounts() {
        if (fare){
            this.charge = this.speed * 12;
        } else {
            this.charge = this.speed * 10;
        }
    }

    public void setFare(boolean fare) {
        this.fare = fare;
    }

    public void display() {
        System.out.println("Company: "+this.company);
        System.out.println("Charge: "+this.charge);
        System.out.println("Fare?: "+this.fare);
    }

}
