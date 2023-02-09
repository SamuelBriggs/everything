package tdd;

import chapter3Exercises.Clock.WallClock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


/*(Clock Class) Create a class called Clock that includes three instance variables—an hour
        (type int), a minute (type int) and a second (type int). Provide a constructor that initializes the
        three instance variables and assumes that the values provided are correct. Provide a set and a get
        method for each instance variable. The set method should set the value of all three variables to 0 if
        the value of hour is more than 23, the value of minute is more than 59, and the value of second is
        more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write
        a test app named ClockTest that demonstrates class Clock’s capabilities.*/

public class ClockTest {
    @Test
    public void checkIfObjectOfClassCanBeCreated() {
        WallClock clock = new WallClock(12, 9, 43);
        assertNotNull(clock);
    }
    @Test
    public void checkDisplayTime(){

        WallClock clock = new WallClock(45, 9, 59);
        clock.setClock(45, 10, 5);
        assertEquals("00:10:05", clock.DisplayTime());

    }

    @Test
    public void checkIfInstanceVariablesHasBeenInstantiated(){
        WallClock clock = new WallClock(12, 9, 67);
        assertEquals(9, clock.getMinute());
    }

    @Test
    public void checkIfHourMinuteSecondsChangeToZeroWhenExceedRequired(){
        WallClock clock = new WallClock(21, 34, 45);

        assertEquals(21, clock.getHour());
        assertEquals(34, clock.getMinute());
        assertEquals(45, clock.getSeconds());

    }

    @Test

    public void checkIfSetMethodsChangeToZeroWhenExceedRequired(){
        WallClock clock = new WallClock(56, 32, 68);
        clock.setClock(25, 12, 65);
        assertEquals(0, clock.getSeconds());
        assertEquals(0, clock.getHour());



    }
}



