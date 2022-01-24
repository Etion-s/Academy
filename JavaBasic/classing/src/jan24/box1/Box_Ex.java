package jan24.box1;

public class Box_Ex {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();

        box1.setT("hello");
        String check = box1.getT();
        System.out.println(check);

        Box<String> box2 = new Box<>();
        box2.setT("bye");
        String check1 = box2.getT();
        System.out.println(check1);
    }
}
