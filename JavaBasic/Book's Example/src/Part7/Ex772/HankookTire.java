package Part7.Ex772;

public class HankookTire extends Tire{
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accmulatedRotation;
        if(accmulatedRotation<maxRotation){
            System.out.println(location+"한국타이어 수명: "+(maxRotation-accmulatedRotation));
            return true;
        } else{
            System.out.println("****"+location+"한국타이어 펑크 ****");
            return false;
        }
    }
}
