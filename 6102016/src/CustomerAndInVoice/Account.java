package CustomerAndInVoice;

/**
 * Created by sam1 on 08.10.16.
 */
public class Account {
    private int id;
    private Customer customer;
    double balance=0.0;

    public Account(int id,Customer customer,double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }
    public int getId(){
        return id;
    }
    public  Customer getCustomer(){
        return  customer;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getCustomerName(){
        return  customer.getName();
    }
    public  double deposit(double amount){
        return amount;
    }
    public double withdraw(double amount){
        if (balance>=amount)
            return balance-amount;
        else System.out.println("amount withdrawn" +
                "exceed the current balance ");
        return 0;
    }
    public String toString(){
        return customer.getName()+"("+id+")";
    }
}
