public class Ex13 {
    public static void main(String[] args) {
        int[] x={0, '0','A','a'};
        System.out.println(add(x));
    }
    public static int add(int arr[]) {
        int x = -1;
        for (int i : arr) {
            x = x<i ? i :x;
        }
        return x;
    }
}
