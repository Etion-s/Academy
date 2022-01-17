package jan17.Ex95_1;

public class Anonymous_Example {
    public static void main(String[] args) {
        Anonymous a = new Anonymous();

        a.spider1.attack();

        a.method1();

        a.method2(new Insect(){
            String name = "타란튤라";
            void cobweb() {
                System.out.println("아몰랑식");
            }

            @Override
            void attack() {
                System.out.println(name + ": 공걱x");
            }
        });
        a.spider1.attack();
    }
}
