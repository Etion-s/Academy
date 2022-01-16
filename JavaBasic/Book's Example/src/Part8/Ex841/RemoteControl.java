package Part8.Ex841;

public interface RemoteControl {
    //상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디폴트메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute ON");
        } else {
            System.out.println("Mute OFF");
        }
    }

    static void changeBattery() {
        System.out.println("changing...");
    }


}
