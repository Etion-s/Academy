package OOPTest;

public class Ex17 {
    String s;

    public static void main(String[] args) {
        Ex17 ex17 = new Ex17();
        ex17.go();
    }

    void Test() {
        s = "Constructor";
    }

    void go() {
        System.out.println(s);
    }
}
