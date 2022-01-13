package jan13.plo1;

public class HankookTire extends Tire{
    public HankookTire(String location, int maxRotation){
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accRotation;
        if(accRotation<maxRotation) {
            System.out.println(location+"한국타이어 수명: "+(maxRotation-accRotation));
            return true;
        } else {
            System.out.println("****"+location+"한국타이어 펑크 ****");
            return false;
        }
    }
}
