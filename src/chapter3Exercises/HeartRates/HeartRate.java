package chapter3Exercises.HeartRates;

public class HeartRate {

    private String firstName;
    private String lastName;
    private String monthOfBirth;
    private String dayOfBirth;
    private int yearOfBirth;

    private double targetHeartRateRange;

    private int maxHeartRate;

    private int ageInyears;

    public HeartRate(String firstName, String lastName, String monthOfBirth, String dayOfBirth, int yearOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAgeInYears() {
        int currentYear = 2022;
        this.ageInyears = currentYear - this.yearOfBirth;
    }

    public int getAgeInyears(){
        return  ageInyears;
    }

    public void calcMaximumRate() {

        this.maxHeartRate = 220 - ageInyears;

    }

    public int getMaxRate(){
        return maxHeartRate;
    }
    public void setTargetHeartRateRange(double percent) {
        targetHeartRateRange = ((percent/100) * maxHeartRate);
        System.out.println(targetHeartRateRange);
    }

    public double getTargetHeartRateRange(){
        return targetHeartRateRange;
    }
}
