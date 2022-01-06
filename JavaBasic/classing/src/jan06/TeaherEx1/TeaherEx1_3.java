package jan06.TeaherEx1;
//(3) char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
import java.util.Scanner;

public class TeaherEx1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        String check = sc.next();
        System.out.println("");

        if (check.equals("x")&check.equals("X")){
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
