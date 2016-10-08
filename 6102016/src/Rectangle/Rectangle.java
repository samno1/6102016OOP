package Rectangle;

/**
 * Created by sam1 on 07.10.16.
 */
public class Rectangle {
    private  float length;
    private float width;

    public Rectangle(){
        length=1.0f;
        width=1.0f;
    }
    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }
    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public float getPerimeter(){
        return (length+width)*2;
    }
    public void setLength(float length){
        this.length=length;
    }
    public void setWidth(float width){
        this.width=width;
    }
    public String toString(){
        return "Rectangle[length= "+length+",width= "+width+"and perimeter of "+getPerimeter()+"]";
    }
}
