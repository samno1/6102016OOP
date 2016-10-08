package CustomerAndInVoice;

/**
 * Created by sam1 on 08.10.16.
 */
public class CustomerInVoiceTest {
    public static void main(String[]args){
        Customer cl=new Customer(508,"Macron",192);
        System.out.println(cl);

        Invoice Inv=new Invoice(558,cl,800);
        System.out.println(Inv);
        System.out.println(Inv.getAmount());

        Account account1 = new Account(500,cl,600);
        System.out.println(account1);

        System.out.println(account1.deposit(1000));

        System.out.println(account1.withdraw(100));

    }
}
