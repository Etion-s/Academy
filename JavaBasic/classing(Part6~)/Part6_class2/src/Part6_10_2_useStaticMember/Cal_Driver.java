package Part6_10_2_useStaticMember;

public class Cal_Driver {
    public static void main(String[] args) {
        double result1= 10 * 10 * Cal.pi;
        int result2 = Cal.plus(1,2);
        int result3 = Cal.minus(4,2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
