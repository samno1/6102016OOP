package MyPoint;

/**
 * Created by sam1 on 07.10.16.
 */
public class MyPointTest {
    public static void main(String[]args){
//        MyPoint p1=new MyPoint();
//        System.out.println("\nLes coordonnees initiales du point= "+p1);
//
//        p1.setX(8);
//        p1.setY(6);
//        System.out.println("nouvelles coordonnees du point ="+p1);
//
//        p1.setXY(3,0);
//        System.out.println(p1.getXY()[0]);
//        System.out.println(p1.getXY()[1]);
//        System.out.println(p1);
//
//        MyPoint p2=new MyPoint(0,4);
//        System.out.println(p2);
//        System.out.println(p1.distance(p2));
//        System.out.println(p1.distance(5,6));
//        System.out.println(p1.distance());

        MyPoint[] points=new MyPoint[11];
        for (int i=0;i<points.length;i++){
            points[i]=new MyPoint(i,i);
        }
        for (int i=0;i<points.length;i++)
            System.out.println(points[i]);
        System.out.println(points[5].distance(points[9]));
    }
}
