package Part6.Ex681;

public class Computer_Example {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values1 = {1,2,3};
        int result1 = myCom.sum1(values1);
        System.out.println("Result1: "+result1);

        int result2 = myCom.sum1(new int[] {1,2,3,4,5});
        System.out.println("Result2: "+result2);
        
        int result3 = myCom.sum2(1,2,3);
        System.out.println(result3);

    }
}
