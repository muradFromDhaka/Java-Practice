package Method8;

public class BankAccount {
    public String accountHolder;
    public double balance;

     public BankAccount(String Holder, double balance){
        accountHolder = Holder;
        this.balance = balance;
     }

     public void deposit(double amount){
        balance += amount;
        System.out.println(amount + " deposited; New balance: " + balance);
     }

     public void withdrow(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrown; New balance : " + balance);
        }
     }

     public void displayInfo(){
        System.out.println("Your Account : " + accountHolder);
        System.out.println("Your Current balance: " + balance);
        System.out.println("=========================================");
     }


     public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Abdur Rahman", 10000);


        a1.displayInfo();
        a1.deposit(200);
        a1.withdrow(700);
        a1.displayInfo();

     }
}
