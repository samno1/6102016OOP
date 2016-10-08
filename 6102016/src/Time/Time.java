package Time;

/**
 * Created by sam1 on 07.10.16.
 */
public class Time {
    private int hour,minute,second;

    public Time(int hour,int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return  minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void Time(int hour,int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
//    public  int nextSecond(){
//        second++;
//        Time(hour,minute,second++);
//        return second;
//    }
    public Time previousSecond(){
        second--;
        Time(hour,minute,second);
        return this;
    }
    public Time nextSecond(){
        second++;
        Time(hour,minute,second);
        return this;
    }
    public String toString(){
        System.out.println("the time is");
        return hour+":"+minute+":"+second;
    }
}
