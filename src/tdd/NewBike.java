package tdd;

public class NewBike {


    private boolean switchBike;
    private int speed;
    private int gear;

    public void changeSwitchState(String OnOrOFF) {
        if (OnOrOFF.equals("ON")) {
            switchBike = true;
            speed = 0;
        }
        if (OnOrOFF.equals("OFF")) {
            switchBike = false;
            speed = 0;
        }

    }

    public boolean getSwitchState() {
        return switchBike;
    }

    public void accelerate(int currentspeed) {
        if (currentspeed <= 20) {
            gear = 1;
            speed = currentspeed + gear;
        }
        if (currentspeed >= 21 && currentspeed <= 30) {
            gear = 2;
            speed = currentspeed + gear;
        }
        if (currentspeed >= 31 && currentspeed <= 40) {
            gear = 3;
            speed = currentspeed + gear;
        }
        if (currentspeed >= 41) {
            gear = 4;
            speed = currentspeed + gear;
        }
    }

    public int checkSpeed() {
        return speed;
    }

    public void decelerate(int currentSpeed) {
        if (currentSpeed <= 20) {
            gear = 1;
            speed = currentSpeed - gear;}
        if (currentSpeed >= 21 && currentSpeed <= 30) {
            gear = 2;
            speed = currentSpeed - gear;
        }
        if (currentSpeed >= 31 && currentSpeed <= 40) {
            gear = 3;
            speed = currentSpeed - gear;
        }
        if (currentSpeed >= 41) {
            gear = 4;
            speed = currentSpeed - 4;
        }
    }

    public void setGear(){
        if (speed <= 20){
            this.gear = 1;
        }
        if (speed >= 21 && speed <=30){
            this.gear = 2;
        }
        if (speed >= 31 && speed <=40){
            this.gear = 3;
        }
        if (speed >= 41){
            this.gear = 4;
        }


    }

    public int getGear(){
        return gear;
    }


}