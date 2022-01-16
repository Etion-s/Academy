package Part8.Ex841;

public class Audio implements RemoteControl{
    private int volume;
    private boolean mute; // 초기값 false;

    @Override
    public void turnOn() {
        System.out.println("Audio ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio OFF");

    }
    @Override
    public void setVolume(int volume) {
        if (volume>=RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<=RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now Audio's Volume: "+volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if (mute) {
            System.out.println("Audio Mute ON");
        } else {
            System.out.println("Audio Mute OFF");
        }
    }
}
