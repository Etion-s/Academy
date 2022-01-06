//for문을 활용해서 1부터 100까지 더한다
public class ForEx1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<101; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
