package jan06.TeaherEx1;
// ex1) 다음 문장들을 조건식으로 표현하라
// (1) int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식

import java.util.Scanner;

public class TeaherEx1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int check = sc.nextInt();
        System.out.println("");

        if(check>10 & check<20){
            System.out.println(check);
        }
    }
}
