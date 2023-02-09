package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewBikeTest {
    @Test
    public void switchBikeOnTest(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        assertEquals(true, AutoBike.getSwitchState());
    }
    @Test
    public void switchBikeOffTest(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("Off");
        assertEquals(false, AutoBike.getSwitchState());
    }
    @Test
    public void accelerateOnGearOne(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(16);
        int currentSpeed = AutoBike.checkSpeed();
        assertEquals(17, currentSpeed);
    }
    @Test

    public void accelerateOnGearTwo(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(21);
        int currentSpeed = AutoBike.checkSpeed();
        assertEquals(23, currentSpeed);
    }

    @Test

    public void accelerateOnGearThree(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(31);
        int currentSpeed = AutoBike.checkSpeed();
        assertEquals(34, currentSpeed);
    }

    @Test

    public void accelerateOnGearFour(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(41);
        int currentSpeed = AutoBike.checkSpeed();
        assertEquals(45, currentSpeed);
    }
    @Test
    public void decelerateOnGearOne(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(15);
        int checkSpeed = AutoBike.checkSpeed();
        AutoBike.decelerate(checkSpeed);
        int checkCurrentSpeed = AutoBike.checkSpeed();
        assertEquals(15, checkCurrentSpeed);
    }

    @Test
    public void decelerateOnGearTwo(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(22);
        int checkSpeed = AutoBike.checkSpeed();
        AutoBike.decelerate(checkSpeed);
        int checkCurrentSpeed = AutoBike.checkSpeed();
        assertEquals(22, checkCurrentSpeed);
    }

    @Test
    public void decelerateOnGearThree(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(32);
        int checkSpeed = AutoBike.checkSpeed();
        AutoBike.decelerate(checkSpeed);
        int checkCurrentSpeed = AutoBike.checkSpeed();
        assertEquals(32, checkCurrentSpeed);
    }

    @Test
    public void decelerateOnGearFour(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(45);
        int checkSpeed = AutoBike.checkSpeed();
        AutoBike.decelerate(checkSpeed);
        int checkCurrentSpeed = AutoBike.checkSpeed();
        assertEquals(45, checkCurrentSpeed);
    }

    @Test
    public void changeGearfrom1to2Test(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(20);
        AutoBike.setGear();
        int checkGear = AutoBike.getGear();
        assertEquals(2, checkGear);
    }

    @Test
    public void changeGearfrom2to3Test(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(30);
        AutoBike.setGear();
        int checkGear = AutoBike.getGear();
        assertEquals(3, checkGear);
    }
    @Test
    public void changeGearfrom3to4Test(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.accelerate(39);
        AutoBike.setGear();
        int checkGear = AutoBike.getGear();
        assertEquals(4, checkGear);
    }

    @Test
    public void changeGearfrom2to1Test(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.decelerate(21);
        AutoBike.setGear();
        int checkGear = AutoBike.getGear();
        assertEquals(1, checkGear);
    }

    @Test
    public void changeGearfrom3to2Test(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.decelerate(31);
        AutoBike.setGear();
        int checkGear = AutoBike.getGear();
        assertEquals(2, checkGear);
    }

    @Test
    public void changeGearfrom4to3Test(){
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.decelerate(44);
        AutoBike.setGear();
        int checkGear = AutoBike.getGear();
        assertEquals(3, checkGear);
    }

    @Test
    public void changeGearfrom4to2Test() {
        NewBike AutoBike = new NewBike();
        AutoBike.changeSwitchState("ON");
        AutoBike.decelerate(44);
        AutoBike.setGear();
        int checkGear = AutoBike.getGear();
        assertEquals(3, checkGear);

    }
}
