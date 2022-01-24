package Button3;

public class Button_Example {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setListener(new Message());
        btn.touch();

        btn.setListener(new Phone());
        btn.touch();
    }
}
