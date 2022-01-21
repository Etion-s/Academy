package Button;

public class Window {
    Button b1 = new Button();
    Button b2 = new Button();

    //필드 초기값으로 대입
    Button.OnclickListener listener = new Button.OnclickListener() {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다");
        }
    };

    Window() {
        b1.setOnClickListener(listener);
        b2.setOnClickListener(new Button.OnclickListener() {
            @Override
            public void onClick() {
                System.out.println("메세지를 보냅니다.");
            }
        });
    }
}
