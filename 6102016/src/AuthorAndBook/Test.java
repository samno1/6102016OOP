package AuthorAndBook;

/**
 * Created by sam1 on 07.10.16.
 */
public class Test {
    public static void main(String[]args){
        Author sam=new Author("Sam","sam1@",'M');

        System.out.println(sam.toString());
        sam.setEmail("mimi@");
        System.out.println(sam.toString());
    }
}
