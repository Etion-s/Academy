package jan14.Ex833_multiInterface;

public class SmartTelevison implements RemoteControl, Searchable{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("SmartTV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV OFF");
    }

    @Override
    public void setVolume(int volume) {
        if (volume> jan14.Ex84_InterfaceHowToUse.RemoteControl.MAX_VOLUME) {
            this.volume = jan14.Ex84_InterfaceHowToUse.RemoteControl.MAX_VOLUME;
        } else if (volume< jan14.Ex84_InterfaceHowToUse.RemoteControl.MIN_VOLUME) {
            this.volume = jan14.Ex84_InterfaceHowToUse.RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now SmartTV's Volume: "+volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url+"-> now searching....");
    }
}
