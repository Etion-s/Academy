package OOPTest;

public class Ex23 {
    private static int a = 2;

    public static void main(String[] args) {
        modify(a);
        System.out.println(a); //4
    }

    public static void modify(int b){
        a += b;
    }
}
