package Part6.Ex19_20;

public class AccountExample {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.setBalance(10000);
        System.out.println("현재 잔고: " + a1.getBalance());

        a1.setBalance(-100);
        System.out.println("현재 잔고: " + a1.getBalance());

        a1.setBalance(2000000);
        System.out.println("현재 잔고: " + a1.getBalance());

        a1.setBalance(300000);
        System.out.println("현재 잔고: " + a1.getBalance());

    }
}
