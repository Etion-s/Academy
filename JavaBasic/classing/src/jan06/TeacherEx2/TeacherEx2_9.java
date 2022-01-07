package jan06.TeacherEx2;

import java.util.Scanner;

//사용자로부터 입력받은 정수의 각 자리의 합을 더한 결과를 출력하는 프로그램
//예를 들어, 사용자가 53263을 입력하였다면 결과는 19
public class TeacherEx2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력: ");
        int input = sc.nextInt();

        int sum = 0;
        while(input>0){
            sum += input%10;
            input /= 10;
        }
        System.out.println(sum);
    }
}
