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
            System.out.println(location+"쪽 Tire수명: "+(maxRotation-accRotation)+"회");
            return true;
        } else {
            System.out.println("****"+location+"쪽 Tire펑크 ****");
            return false;
        }
    }
}
