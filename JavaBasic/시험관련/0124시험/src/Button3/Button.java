package Button3;

public class Button {
    interface onClickListener{
        void onClick();
    }

    onClickListener listener;

    void setListener(onClickListener listener) {
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }
}
