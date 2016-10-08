package Rectangle;

/**
 * Created by sam1 on 07.10.16.
 */
public class RectangleTest {
    public static void main(String[]args){
        Rectangle r=new Rectangle();
        System.out.println( r.getLength()+"\n"+r.getWidth()+"\n"+ r.getPerimeter());
        Rectangle r2=new Rectangle(6,10);
        System.out.println(r2.toString());
    }

}
