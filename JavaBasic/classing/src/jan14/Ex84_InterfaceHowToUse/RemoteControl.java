package jan14.Ex84_InterfaceHowToUse;

public interface RemoteControl {
    // final static
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 1;

    // abstract method
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // default method
    public default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute ON");
        } else {
            System.out.println("Mute OFF");
        }
    }

    // static method
    public static void changeBattery() {
        System.out.println("Battery changing...");
    }
}
