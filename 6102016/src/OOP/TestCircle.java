package OOP;

/**
 * Created by sam1 on 07.10.16.
 */
public class TestCircle {
    public static void main(String[]args ){
        Circle cl=new Circle();
        System.out.println("The circle has a radius of "+cl.getRadius()+" and the area of"
                +cl.getArea()+" and has the "+cl.getColor()+" color");
        Circle cl2=new Circle(4.0,"Blue");
        System.out.println("The circle has a radius of "+cl2.getRadius()+" and the area of"
                +cl2.getArea()+" and the "+cl2.getColor()+" color");

        Circle cl3=new Circle(5.0,"black");
        System.out.println(cl3.toString());

        Circle cl4=new Circle(6.0,"white");
        System.out.println( cl4);
    }
}
