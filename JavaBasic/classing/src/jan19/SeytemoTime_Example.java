package jan19;

public class SeytemoTime_Example {
    public static void main(String[] args) {
        long time1 = System.nanoTime();

        int sum = 0;
        for (int i=0; i<=1000000; i++) {
            sum += i;
        }

        long time2 = System.nanoTime();

        System.out.println("합: "+sum);
    }
}
