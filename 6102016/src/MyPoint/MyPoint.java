package MyPoint;

/**
 * Created by sam1 on 07.10.16.
 */
public class MyPoint {
    private  int x=0;
    private  int y=0;

    public MyPoint(){
        int x;
        int y;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public  void  setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        int[] array={x,y};
        return array;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double distance(int x, int y){
        int xDiff=this.x-x;
        int yDiff=this.x-y;
         double dist=Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        return dist;
    }
    public double distance(MyPoint another){
        int xDiff=this.x-another.x;
        int yDiff=this.y-another.y;
        double dist=Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        return dist;
    }
    public double distance(){
        int xDiff=this.x;
        int yDiff=this.y;
        double dist=Math.sqrt(xDiff*xDiff+yDiff*yDiff);
        return dist;
    }
    public String toString(){
       String print= "(x,y)= ("+x+","+y+")";
        return print;
    }


}
