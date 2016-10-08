package AuthorAndBook;

/**
 * Created by sam1 on 07.10.16.
 */
public class TestBook {
    public static void main(String[]args){
        Author[] authors=new Author[3];
        authors[0]=new Author("Sam1","sam1@ttt",'M');
        authors[1]=new Author("sam2","sam2@ttt",'M');
        authors[2]=new Author("Sam3","sam3@ttt",'M');

        Book book1=new Book("Learning Java",authors,20.20,99);
        System.out.println(book1);
    }
}
