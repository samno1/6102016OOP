package Time;

/**
 * Created by sam1 on 07.10.16.
 */
public class TimeTest {
    public static void main(String[]args){
        System.out.println("hello world," );
    Time t1=new Time(12,14,30);
        System.out.println(t1.toString());
        Time t0=new Time(12,14,30);
        System.out.println(t0.nextSecond());
        Time t2=new Time(12,14,30);
       System.out.println(t2.previousSecond());
    }
}
