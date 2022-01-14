package jan13.ExInterface;

public interface ReomteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute Mode ON");
        } else {
            System.out.println("Mute Mode OFF");
        }
    }

    static void changeBattery() {
        System.out.println("Change Battery...");
    }
}
