package Method_Ex2_noknowParameter;

public class Computer_Driver {
    public static void main(String[] args) {
        Computer com1 = new Computer();
        int[] values1 = {1,2,3};
        int result1 = com1.sum1(values1);
        System.out.println("배열로 메서드값:"+result1);

        int result2 = com1.sum1(new int[] {1,2,3,4,5});
        System.out.println("sum1파라메타로 new를 이용해서 넘김" + result2);

        int result3 = com1.sum2(1,2,3);
        System.out.println("sum2에 3개의 int파라메타"+result3);

        int result4 = com1.sum2(1,2,3,4,5);
        System.out.println("sum2에 5개의 int파라메타"+result4);

    }
}
