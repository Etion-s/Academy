package jan06.TeaherEx1;
//(2) char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식
import java.util.Scanner;

public class TeaherEx1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        String check = sc.next();
        System.out.println("");

        if (check.equals(" ")&check.equals("    ")){
            System.out.println(false);
        } else
            System.out.println(true);


    }
}
