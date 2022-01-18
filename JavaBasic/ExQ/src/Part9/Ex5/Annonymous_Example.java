package Part9.Ex5;

public class Annonymous_Example {
    public static void main(String[] args) {
        Annonymous annoy = new Annonymous();
        annoy.field.run();
        annoy.method1();
        annoy.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다");
            }
        });
    }


}
