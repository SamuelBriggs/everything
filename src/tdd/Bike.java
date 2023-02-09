package tdd;

public class Bike {
    private boolean bikeSwitch;
    private int gearOne = 1;
    private int speed;
    private int gearTwo = 2;
    private int gearThree = 3;
    private int gearFour = 4;
    private int gearStatus;


    public void switchBike(String onOrOff) {
        if (onOrOff == "ON"){
        bikeSwitch = true;}

        else{
           bikeSwitch = false;}

    }

    public boolean getSwitchState() {
        return bikeSwitch;
    }

    public void accelerate(int speed, int gear) {
        this.speed = speed;
        if (gear == 1)
        {this.speed = speed + gearOne;}
        if (gear == 2)
        {this.speed = speed + gearTwo;}
        if (gear == 3)
        {this.speed = speed + gearThree;}
        if (gear == 4) {
            {this.speed = speed + gearFour;}
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void deccelerate(int currentSpeed, int gear) {
        speed = currentSpeed;
        if ( gear == 1)
         {speed = speed - gearOne;}
        if (gear == 2)
        {this.speed = speed - gearTwo;}
        if (gear == 3)
        {this.speed = speed - gearThree;}
        if (gear == 4) {{this.speed = speed - gearFour;}
        }
    }

    public void changeGear(int checkSpeed) {
        if (checkSpeed <= 20) {
            gearStatus = gearOne;
        }
        if (checkSpeed >=21 && checkSpeed<=30)
            {gearStatus = gearTwo;}
        if (checkSpeed >= 31 && checkSpeed <=40)
            {gearStatus = gearThree;}
        if (checkSpeed >= 41)
            {gearStatus = gearFour;}

    }

    public int getGear() {
        return gearStatus;
    }
}
