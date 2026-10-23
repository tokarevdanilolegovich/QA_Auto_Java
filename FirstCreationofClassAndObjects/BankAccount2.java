package FirstCreationofClassAndObjects;

public class BankAccount2 {
    private String owner;
    private int balance;
    BankAccount2(String owner,int balance){
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

    public void deposit(int amount){
        this.balance = this.balance + amount;
    }
    public void withdraw(int amount){
        this.balance = this.balance - amount;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
    public static void main(String args[]){
        BankAccount2 ba2 = new BankAccount2("Owner",0);
        ba2.printBalance();
        ba2.deposit(5500);
        ba2.printBalance();
        ba2.withdraw(1500);
        ba2.printBalance();


    }
}
