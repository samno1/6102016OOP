package CustomerAndInVoice;

/**
 * Created by sam1 on 07.10.16.
 */
public class Customer {
    private int ID;
    private String name;
   private int discount;
    private char gender;
    public Customer(int ID,String name,int discount){
        this.ID=ID;
        this.name=name;
        this.discount=discount;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
////    public int getDiscount(){
////        return discount;
////    }
////    public void setDiscount(int discount){
////        this.discount=discount;
//    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return name+"("+ID+")";
    }
}
