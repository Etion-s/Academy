package jan11;

public class Ex1 {
    private int speed;
    private boolean stop; // boolean의 초기값 = false

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if(speed<0){
            this.speed = speed;
            return; // 종료?
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop){
        this.stop = stop;
        this.speed = 0;
    }
}
