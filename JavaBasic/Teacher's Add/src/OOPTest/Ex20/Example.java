package OOPTest.Ex20;

public class Example {
    public static void main(String[] args) {
        Test x1 = new Test(10);
        Test x2 = new Test(10);

        mehtod(x1,x2);

        System.out.println(x1.x + "  " + x2.x);

    }
    public static void mehtod(Test v1, Test v2){
        v2.x = 20;
        v1 = v2;
    }
}
