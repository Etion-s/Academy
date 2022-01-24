import java.util.Scanner;

public class Random2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("난수 갯수를 입력하세요");
        int count = sc.nextInt();

        int sum = 0;
        for (int i=0; i<count; i++){
            int num = (int)(Math.random()*45+1);
            System.out.println("난수발생: "+num);
            sum += num;

        }
        System.out.println("난수의 총합: "+sum);
    }
}
