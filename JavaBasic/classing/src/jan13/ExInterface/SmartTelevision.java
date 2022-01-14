package jan13.ExInterface;

public class SmartTelevision implements ReomteControl, Searchable{
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("Smart TV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV OFF");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>ReomteControl.MAX_VOLUME) {
            this.volume = ReomteControl.MAX_VOLUME;
        } else if (volume<ReomteControl.MIN_VOLUME) {
            this.volume = ReomteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Now Smart TV's Volume: "+volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "searching...");
    }
}
