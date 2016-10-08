package MyPoint;

/**
 * Created by sam1 on 07.10.16.
 */
public class MyCircle {
    private MyPoint center=new MyPoint(0,0);
    private  int radius=1;
    public MyCircle(int x,int y,int radius){
        center=new MyPoint(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center,int radius){
        this.center=center;
        this.radius=radius;
    }
    public  MyCircle(){
        center=new MyPoint();
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public void  setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void  setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCentetXY(){
        return  center.getXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x,y);
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return radius*2*Math.PI;
    }
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
    public String toString(){
        return "MyCircle[radius ="+radius+","+center+"]";
    }
}
