package SimpleCircle;

/**
 * Created by sam1 on 07.10.16.
 */
public class Circle {
    private double radius;
    public Circle(){
        radius=1.0;
    }

    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getCircumference(){
        return radius*2*Math.PI;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String toString(){
        return "Circle[radius="+radius+" circumference= "+getCircumference()+"]";
    }
}
