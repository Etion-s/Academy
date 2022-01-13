package jan13.plo1;

public class KumhoTire extends Tire{
    public KumhoTire(String location, int maxrotation){
        super(location, maxrotation);
    }

    public boolean roll() {
        ++accRotation;
        if(accRotation<maxRotation) {
            System.out.println(location+"금호타이어 수명: "+(maxRotation-accRotation));
            return true;
        } else {
            System.out.println("****"+location+"금호타이어 펑크 ****");
            return false;
        }
    }
}
