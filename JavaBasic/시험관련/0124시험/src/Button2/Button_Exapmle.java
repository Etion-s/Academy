package Button2;

public class Button_Exapmle {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(new call());
        btn.touch();

        btn.setOnClickListener(new Message());
        btn.touch();
    }
}
