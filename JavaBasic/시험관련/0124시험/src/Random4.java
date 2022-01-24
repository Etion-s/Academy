import java.util.Scanner;

public class Random4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("난수의 개수를 입력하세요");
        int num = sc.nextInt();
        int sum=0;
        for (int i=0; i<num; i++){
            sum += (int) (Math.random()*45+1);
        }
        System.out.println("난수의 개수: "+num);
        System.out.println("1~45 사이의 난수 10개의 합계: "+sum);
    }
}
