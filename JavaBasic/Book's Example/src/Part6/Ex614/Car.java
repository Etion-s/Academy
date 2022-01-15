package Part6.Ex614;

public class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed<=0){
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) { //차를 멈추고 싶을떄 사용하는 메소드
        this.stop = stop;
        this.speed = 0;
    }
}
