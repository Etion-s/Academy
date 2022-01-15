package Part7.Ex72;

public class DmbCellPhone extends CellPhone{
    int channel;

    DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        System.out.println(channel+"번 방송시작");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println(channel+"번으로 방송 변경");
    }
    void turnOffDmb() {
        System.out.println("방송 종료");
    }
}
