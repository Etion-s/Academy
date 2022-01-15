package Part7.Ex72;

public class DmbCellPhone_Example {
    public static void main(String[] args) {
        DmbCellPhone dmb = new DmbCellPhone("iPhone","black", 10);

        System.out.println("model: " + dmb.model);
        System.out.println("color: " + dmb.color);
        System.out.println("channel: " + dmb.channel);

        dmb.powerOn();
        dmb.bell();
        dmb.sendVoice("여보세요?");
        dmb.receiveVoice("저는....");
        dmb.hangUp();

        dmb.turnOnDmb();
        dmb.changeChannelDmb(123);
        dmb.turnOffDmb();
    }
}
