package Part7.Ex772;

public class Tire {
    public int maxRotation;
    public int accmulatedRotation;
    public String location;

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accmulatedRotation;
        if(accmulatedRotation<maxRotation){
            System.out.println(location+"수명: "+(maxRotation-accmulatedRotation));
            return true;
        } else{
            System.out.println("****"+location+"쪽 펑크 ****");
            return false;
        }
    }
}
