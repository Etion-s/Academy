package jan14.Ex84_InterfaceHowToUse;

public class Television implements RemoteControl{
    // tv's field
    private int volume;

    // RemoteControl's real method()
    @Override
    public void turnOn() {
        System.out.println("TV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV OFF");
    }

    @Override
    public void setVolume(int volume) { //볼룸 설정하고 출력
        if (volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now TV's Volume: "+volume);
    }


}