package Chapter8.TimeClassExercise;

public class TimeClass {
    private int hour;
    private int minute;
    private int second;


    public TimeClass(){

    }
    public TimeClass(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
        public void validateTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
        }

        public void validateHour(int hour){

        boolean hourisinvalid = hour < 0 || hour > 23;
        if(hourisinvalid) throw new IllegalArgumentException("Hour is not valid");
        }
        public void validateMinute(int minute){
        boolean minuteisInvalid = minute < 0 || minute > 59;
        if(minuteisInvalid) throw new IllegalArgumentException("Minute is not valid");
        }

        public void validateSecond(int second){
        boolean secondIsInvalid = second < 0 || second > 59;
        if(secondIsInvalid) throw new IllegalArgumentException("Second is not valid");
        }

        public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
        }

        public String toString(){
        String amPM;
            if (hour < 12 ) amPM = "AM";
            else amPM = "PM";
        if (hour == 0 || hour == 12) hour = 12;
        else hour = hour % 12;

            return String.format("%d:%02d:%02d %s",hour, minute, second, amPM );
        }

        public void setTime(int hour, int minute, int second){
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        }












}

