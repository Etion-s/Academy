package Part6.ExQ.BankApp;

import java.util.Scanner;

public class BankApp {
    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);
    private static int count = 0;
    public static void main(String[] args) {

        boolean run = true;

        while (run){
            System.out.println("==================================================");
            System.out.println("  1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료    ");
            System.out.println("==================================================");
            System.out.print("선택: ");
            int select = sc.nextInt();
            
            switch (select) {
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
                    break;
            }
        }
        System.out.println("시스템 종료");
    }

    private static void createAccount() {
        System.out.println("-------------");
        System.out.println("    계좌생성   ");
        System.out.println("-------------");

        System.out.print("계좌번호: ");
        String ano = sc.next();
        System.out.print("계좌주: ");
        String owner = sc.next();
        System.out.print("초기입금액: ");
        int balance = sc.nextInt();

        accountArray[count] = new Account(ano, owner, balance);
        count++;

    }

    private static void accountList() {
        System.out.println("-------------");
        System.out.println("    계좌목록   ");
        System.out.println("-------------");
        for (int i=0; i<count; i++){
            System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner() + " " + accountArray[i].getBalance());
        }
    }

    private static void deposit() {
        System.out.println("-------------");
        System.out.println("      예금    ");
        System.out.println("-------------");
        System.out.print("계좌번호: ");
        String ano = sc.next();
        System.out.print("예금액: ");
        int balance = sc.nextInt();
        Account account = findAccount(ano);
        if (account == null){
            System.out.println("계좌가 존재하지않습니다");
        } else {
            account.setBalance(account.getBalance()+balance);
            System.out.println("예금이 성공되었습니다.");
        }
    }

    private static void withdraw() {
        System.out.println("-------------");
        System.out.println("      출금    ");
        System.out.println("-------------");
        System.out.print("계좌번호: ");
        String ano = sc.next();
        System.out.print("출금액: ");
        int balance = sc.nextInt();
        Account account = findAccount(ano);
        if (account == null){
            System.out.println("계좌가 존재하지않습니다");
        } else {
            account.setBalance(account.getBalance()-balance);
            System.out.println("출금이 성공되었습니다.");
        }
    }

    private static Account findAccount(String ano){
        Account account = null;
        for (int i=0; i<count; i++){
            if (accountArray[i] != null) {
                if (accountArray[i].getAno().equals(ano)){
                    account = accountArray[i];
                }
            }
        }
        return account;
    }

}

/*
* 1.계좌생성

* 2.계좌목록
* 3.예금
* 4.출금
* 5.계좌배열목록에서동일한계좌찾기
*
* 내가 고민중or해볼 부분
- 나의 고객정보에 대한 것은 메인클래스?새로운클래스?
- 고객 정보는 배열에 넣기
  > 메인메소드에서 작성시 계속 덮어 쓰여진다
-
* */