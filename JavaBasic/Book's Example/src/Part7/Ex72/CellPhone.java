package Part7.Ex72;

public class CellPhone {
    String model;
    String color;

    void powerOn() {System.out.println("Power ON");}
    void powerOff() {System.out.println("Power OFF");}
    void bell() {System.out.println("RING! RING!");}
    void sendVoice(String message) {System.out.println("Me: "+message);}
    void receiveVoice(String message) {System.out.println("Friend: "+message);}
    void hangUp() {System.out.println("Call OFF");}

}
