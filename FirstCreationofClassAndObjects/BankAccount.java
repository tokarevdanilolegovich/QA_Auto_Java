package FirstCreationofClassAndObjects;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    //GETTERS:
    String getOwner(){
        return this.owner;
    }
    int getBalance(){
        return this.balance;
    }

    //SETTERS:
    void setOwner(String owner){
        this.owner = owner;
    }
    void setBalance(int balance){
        this.balance = balance;
    }
    public void deposit(int amount){
        this.balance = this.balance + amount;
    }
    public void withdraw(int amount){
        this.balance = this.balance - amount;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
    public static void main(String[] args){
        BankAccount bankAccount1 = new BankAccount("Englishman", 0);
        bankAccount1.deposit(1500);
        bankAccount1.withdraw(1000);
        bankAccount1.printBalance();
    }
}
