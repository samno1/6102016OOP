package AuthorAndBook;

/**
 * Created by sam1 on 07.10.16.
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name,Author[] authors,double price){
        this.name=name;
        this.authors =authors;
        this.price=price;
    }
    public Book(String name,Author[] authors,double price,int qty){
        this.name=name;
        this.authors =authors;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public double getPrice(){
        return  price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public Author[] getAuthorsNames(){
        return authors;
   }
//    public String getAuthorEmail(){
//        return authors.getEmail();
//    }
//    public char getAuthorGender(){
//        return authors.getGender();
//    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        return "Book["+name+"\n{"+authors[0]+";"+authors[1]+"; "+authors[2]+"}\n"+price+"\n"+qty+"]";

    }
}
