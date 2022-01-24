package Button3;

public class Message implements Button.onClickListener{
    @Override
    public void onClick() {
        System.out.println("This is message");
    }
}
