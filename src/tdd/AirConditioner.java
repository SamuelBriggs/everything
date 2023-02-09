package tdd;

public class AirConditioner {

    private boolean airConSwitch;
    private int temperature = 16;

    public void switchAc(String onOrOff) {
        if (onOrOff == "ON") {
            airConSwitch = true;
        }
        else {
            airConSwitch = false;
        }
    }
    public boolean getSwitchStatus() {
        return airConSwitch;
    }

    public void increaseTemp(int tempRate) {
        temperature = temperature + tempRate;
        if ((temperature + tempRate) > 30)
                    {
                        temperature = 30;
                    }
    }

    public int getTemp() {
        return temperature;
    }

    public void decreaseTemp(int tempRate) {
        if ((temperature - tempRate) >= 16)
            temperature = temperature - tempRate;


    }
}
