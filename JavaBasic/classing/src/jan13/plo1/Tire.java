package jan13.plo1;

public class Tire {
    public int maxRotation;
    public int accRotation;
    public String location;

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accRotation;
        if(accRotation<maxRotation) {
            System.out.println(location+"의 수명: "+(maxRotation-accRotation));
            return true;
        } else {
            System.out.println("****"+location+"타이어 펑크 ****");
            return false;
        }
    }
}
