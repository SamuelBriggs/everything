package tdd;

import chapter3Exercises.HeartRates.HeartRate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRateTests {

    @Test
    public void checkThatObjectsOfClassCanBeCreated() {
        HeartRate heartRate = new HeartRate("Samuel", "Alawode", "11", "14", 1995);
        assertNotNull(heartRate);
    }

    @Test
    public void checkThatInstancesOfTheClassAreProperlyCreated() {
        HeartRate heartrate = new HeartRate("Samuel", "Alawode", "11", "14", 1995);
        heartrate.getFirstName();
        assertEquals("Samuel", heartrate.getFirstName());

    }

    @Test
    public void ageInYearsTest() {
        HeartRate heartrate = new HeartRate("Samuel", "Alawode", "11", "14", 1995);
        heartrate.setAgeInYears();
        assertEquals(27, heartrate.getAgeInyears());
    }

    @Test
    public void maximumHeartRateCheck() {
        HeartRate heartrate = new HeartRate("Samuel", "Alawode", "11", "14", 1995);
        heartrate.setAgeInYears();
        heartrate.calcMaximumRate();
        assertEquals(193, heartrate.getMaxRate());
    }

    @Test

    public void targetHeartRangeText(){
        HeartRate heartrate = new HeartRate("Samuel", "Alawode", "11", "14", 1995);
        heartrate.setAgeInYears();
        heartrate.calcMaximumRate();
        heartrate.setTargetHeartRateRange(85);
        assertEquals(164.04999999999998, heartrate.getTargetHeartRateRange());



    }

}

