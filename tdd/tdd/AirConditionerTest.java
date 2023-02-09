package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test

    public void setTemperatureOnTest() {
        AirConditioner newAc = new AirConditioner();
        newAc.switchAc("ON");
        boolean checkingSwitch = newAc.getSwitchStatus();
        assertEquals(true, checkingSwitch);
    }

    @Test

    public void setTemperatureOffTest() {

        AirConditioner newAc = new AirConditioner();
        newAc.switchAc("ON");
        newAc.switchAc("OFF");
        boolean checkingSwitch = newAc.getSwitchStatus();
        assertEquals(false, checkingSwitch);

    }

    @Test

    public void increaseTemperatureTest() {
        AirConditioner newAc = new AirConditioner();
        newAc.switchAc("ON");
        newAc.increaseTemp(2);
        int checkingTemp = newAc.getTemp();
        assertEquals(18, checkingTemp);
    }

    @Test

    public void decreaseTemperatureTest() {
        AirConditioner newAc = new AirConditioner();
        newAc.switchAc("ON");
        newAc.increaseTemp(5);
        newAc.decreaseTemp(3);
        int checkingTemp = newAc.getTemp();
        assertEquals(18, checkingTemp);
    }

    @Test

    public void increaseTempBeyond30() {
        AirConditioner newAc = new AirConditioner();
        newAc.switchAc("ON");
        newAc.increaseTemp(48);
        int checkingTemp = newAc.getTemp();
        assertEquals(30, checkingTemp);
    }

    @Test

    public void decreaseTemperatureTestBeyond16() {
        AirConditioner newAc = new AirConditioner();
        newAc.switchAc("ON");
        newAc.decreaseTemp(100);
        int checkingTemp = newAc.getTemp();
        assertEquals(16, checkingTemp);

    }
}





