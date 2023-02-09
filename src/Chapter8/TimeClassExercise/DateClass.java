package Chapter8.TimeClassExercise;

public class DateClass {
    private int month;
    private int day;
    private int year;
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateClass(int month, int day, int year){
        validateDate(month, day, year);

        this.month = month;
        this.day = day;
        this.year = year;

    }
    public void validateMonth(int month){

        boolean monthIsInValid = month <= 0 || month > 12;
        if (monthIsInValid) throw new IllegalArgumentException("Month is not Valid.");
    }
    public void validateDay(int day){
        boolean dayIsInvalid = (day <= 0) ;
        if (dayIsInvalid) throw new IllegalArgumentException("Day is out of range");
    }



    public void validateDate(int month, int day, int year){
        validateMonth(month);
        validateDay(day);

    }

    public String tString(){
    return String.format("%d/%d/%d", month, day, year);
    }






}
