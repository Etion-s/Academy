package Part6.Ex19_20;

import java.util.Scanner;

public class AccountExample {
    private static Scanner sc = new Scanner(System.in);
    private static Account[] accountArray = new Account[100];
    private static int check = 0;

    public static void main(String[] args) {
        boolean run= true;

        while (run){
            System.out.println("-------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.출금");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            int N = sc.nextInt();

            switch (N) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램종료");
                    break;
                default:
                    System.out.println("잘못입력");
                    break;
            }
        }
    }
    private static void createAccount() {
        String account_number;
        String name;
        int balance;

        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        account_number = sc.next();
        System.out.print("계좌주: ");
        name = sc.next();
        System.out.print("초기입금액: ");
        balance = sc.nextInt();
        accountArray[check] = new Account(account_number, name, balance);
        check++;
    }

    private static void accountList() {
        System.out.println("-----------------");
        System.out.println("계좌목록");
        System.out.println("-----------------");

        for (int i=0 ; i<check; i++){
            System.out.print(accountArray[i].getAccount_number()+" ");
            System.out.print(accountArray[i].getOwner()+" ");
            System.out.print(accountArray[i].getBalance());
            System.out.println();
        }

    }

    private static void deposit() {
        Account tmp = new Account();

        System.out.println("-----------------");
        System.out.println("예금");
        System.out.println("-----------------");
        System.out.print("계좌번호");
        String an = sc.next();
        System.out.println();

        tmp = findAccount(an); // 계좌번호 넘김
        System.out.print("예금액: ");
        int money = sc.nextInt();
        int balence = tmp.getBalance();
        tmp.setBalance(balence+money);
        System.out.println();
        System.out.println("예금 성공");

    }
    private static void withdraw() {
        Account tmp = new Account();

        System.out.println("-----------------");
        System.out.println("출금");
        System.out.println("-----------------");
        System.out.print("계좌번호");
        String an = sc.next();
        System.out.println();
        tmp = findAccount(an);
        System.out.print("출금액: ");
        int money = sc.nextInt();
        int blanec =tmp.getBalance();
        tmp.setBalance(blanec-money);
        System.out.println();
        System.out.println("출금 성공");


    }

    private static Account findAccount(String account_number){
        Account tmp = new Account();
        for (int i=0; i<check; i++){
            String account = accountArray[i].getAccount_number();
            if (account_number.equals(account)){
                tmp = accountArray[i];
            } else {
                System.out.println("계좌불일치");
            }
        }
        return tmp;
    }
}
