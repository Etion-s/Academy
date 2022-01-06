//while문과scanner를 사용해서 여러기능을 제공하는 프로그램
import java.util.Scanner;
public class WhileNScanner {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (run){
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택>");

            int check = scanner.nextInt();
            switch (check) {
                case 1:
                    System.out.print("예금할 금액입력: ");
                    int inMoney = scanner.nextInt();
                    balance += inMoney;
                    break;
                case 2:
                    System.out.println("출금할 금액입력: ");
                    int outMoney = scanner.nextInt();
                    balance -= outMoney;
                    break;
                case 3:
                    System.out.println("통장잔고: "+balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다");
                    run = false;
                    break;
            }

        }
    }
}
