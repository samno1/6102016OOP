package MyPoint;

/**
 * Created by sam1 on 07.10.16.
 */
public class MyCercleTest {
    public static void main(String[]args){
        MyCircle cl1=new MyCircle(3,8,5);
        System.out.println(cl1);
        MyCircle cl2=new MyCircle();
        System.out.println(cl2);

        MyPoint p1= new MyPoint(4,8);
        cl2.setCenter(p1);
        cl2.setRadius(10);
        System.out.println(cl2);

        MyCircle cl3=new MyCircle();
        cl3.setCenterXY(9,12);
        cl3.setRadius(5);
        System.out.println(cl3);

        System.out.println(cl1.getArea()+", "+cl1.getCircumference()+"," +
                ""+cl1.getCenter()+","+cl1.getRadius());
        System.out.println(cl2.getArea()+", "+cl2.getCircumference()+"," +
                ""+cl2.getCenter()+","+cl2.getRadius());
        System.out.println(cl3.getArea()+", "+cl3.getCircumference()+"," +
                ""+cl3.getCenter()+","+cl3.getRadius());





    }
}
