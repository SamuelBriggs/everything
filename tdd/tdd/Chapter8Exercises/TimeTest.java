package tdd.Chapter8Exercises;


import Chapter8.TimeClassExercise.TimeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TimeTest {
    private TimeClass time;
    private TimeClass time2;

    @BeforeEach

    public void setUp() {
        time = new TimeClass();
        time2 = new TimeClass(15, 45, 37);
    }

    @Test
    public void testThatClassExists() {
        assertNotNull(time);
    }

    @Test
    public void testTime2Exists() {
        assertNotNull(time2);
    }

    @Test
    public void setTime2(){
        try {
            time2.setTime(6,45,34);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(time2.toUniversalString());
        
    }


}
