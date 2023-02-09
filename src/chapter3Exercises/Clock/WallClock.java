package chapter3Exercises.Clock;

public class WallClock{


    private int hour;
    private int minute = 0;

    private int seconds;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }



    public WallClock(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public void setClock(int hour, int minute, int seconds){
        if (hour > 23 ){
            this.hour = 0;
        }
        else {
            this.hour = hour;
        }
        if ( minute > 59  ){
            this.minute = 0;
        }
        else {
            this.minute = minute;
        }
        if (seconds > 59 ){
            this.seconds = 0;
        }
        else {
            this.seconds = seconds;
        }
    }
    public String DisplayTime(){
        String minute = String.valueOf(this.minute);
        if (this.minute < 10){
            minute = "0" + this.minute;}
        String hour = String.valueOf(this.hour);
         if (this.hour < 10)
            {hour = "0" + this.hour; }
         String seconds = String.valueOf(this.seconds);
         if(this.seconds < 10)
                {seconds = "0" + this.seconds;}
         return hour + ":" + minute + ":" + seconds;

        }
    }
















