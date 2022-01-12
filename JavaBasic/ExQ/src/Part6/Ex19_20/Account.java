package Part6.Ex19_20;

public class Account {
    private String account_number;
    private String owner;
    private int balance;

    public Account(String account_number, String owner, int balance) {
        this.account_number = account_number;
        this.owner = owner;
        this.balance = balance;
    }

    public Account() {}

    public String getAccount_number() {return account_number;}
    public void setAccount_number(String account_number) {this.account_number = account_number;}
    public String getOwner() {return owner;}
    public void setOwner(String owner){this.owner = owner;}
    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}
}
