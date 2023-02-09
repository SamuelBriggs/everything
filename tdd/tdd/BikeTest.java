package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
        public void switchBikeOnTest(){

        Bike newBike = new Bike();
        newBike.switchBike("ON");
        boolean checkingBikeSwitch = newBike.getSwitchState();
        assertEquals(true, checkingBikeSwitch);


    }

    @Test
    public void switchBikeOffTest(){

        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.switchBike("OFF");
        boolean checkingBikeSwitch = newBike.getSwitchState();
        assertEquals(false, checkingBikeSwitch);
    }

    @Test
    public void accelerateGearOne(){
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(10, 1);
        int checkSpeed = newBike.getSpeed();
        assertEquals(11, checkSpeed);
    }
    @Test
    public void accelerateGearTwo(){
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(12, 2);
        int checkSpeed = newBike.getSpeed();
        assertEquals(14, checkSpeed);
    }

    @Test
    public void accelerateGearThree(){
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(12, 3);
        int checkSpeed = newBike.getSpeed();
        assertEquals(15, checkSpeed);
    }

    @Test
    public void accelerateGearFour(){
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(12, 4);
        int checkSpeed = newBike.getSpeed();
        assertEquals(16, checkSpeed);
    }

    @Test
    public void deccelerateGearOne(){
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(20, 1);
        int currentSpeed = newBike.getSpeed();
        newBike.deccelerate(currentSpeed,1);
        int checkSpeed = newBike.getSpeed();
        assertEquals(20, checkSpeed);
    }

    @Test
    public void deccelerateGearTwo(){
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(25, 1);
        int currentSpeed = newBike.getSpeed();
        newBike.deccelerate(currentSpeed,2);
        int checkSpeed = newBike.getSpeed();
        assertEquals(24, checkSpeed);
    }

    @Test
    public void deccelerateGearThree(){
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(28, 2);
        int currentSpeed = newBike.getSpeed();
        newBike.deccelerate(currentSpeed,3);
        int checkSpeed = newBike.getSpeed();
        assertEquals(27, checkSpeed);
    }
    @Test
    public void deccelerateGearFour(){
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(30, 3);
        newBike.deccelerate(33,4);
        int checkSpeed = newBike.getSpeed();
        assertEquals(29, checkSpeed);
    }

    @Test

    public void changeGeartoOne(){
       Bike newBike = new Bike();
       newBike.switchBike("ON");
       newBike.accelerate(10, 1);
       int checkSpeed = newBike.getSpeed();
       newBike.changeGear(checkSpeed);
       int checkGear = newBike.getGear();
       assertEquals(1, 1);
       newBike.accelerate(11, checkGear);
       int checkNewSpeed = newBike.getSpeed();
       assertEquals(12, checkNewSpeed);
    }
    @Test

    public void changeGeartoTwo() {
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(20, 1);
        int checkSpeed = newBike.getSpeed();
        newBike.changeGear(checkSpeed);
        int checkGear = newBike.getGear();
        assertEquals(2, checkGear);
        newBike.accelerate(21, checkGear);
        int checkNewSpeed = newBike.getSpeed();
        assertEquals(23, checkNewSpeed);
    }

    @Test
    public void changeGeartoThree() {
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(29, 2);
        int checkSpeed = newBike.getSpeed();
        newBike.changeGear(checkSpeed);
        int checkGear = newBike.getGear();
        assertEquals(3, checkGear);
        newBike.accelerate(31, checkGear);
        int checkNewSpeed = newBike.getSpeed();
        assertEquals(34, checkNewSpeed);
    }


    @Test
    public void changeGeartoFour() {
        Bike newBike = new Bike();
        newBike.accelerate(38, 3);
        int checkSpeed = newBike.getSpeed();
        newBike.changeGear(checkSpeed);
        int checkGear = newBike.getGear();
        assertEquals(4, checkGear);
        newBike.accelerate(41, checkGear);
        int checkNewSpeed = newBike.getSpeed();
        assertEquals(45, checkNewSpeed);
    }
    @Test
    public void decGearToOne() {
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(10, 1);
        int currentSpeed = newBike.getSpeed();
        newBike.deccelerate(currentSpeed,1);
        int checkSpeed = newBike.getSpeed();
        newBike.changeGear(checkSpeed);
        int checkGear = newBike.getGear();
        assertEquals(1, checkGear);
        newBike.deccelerate(checkSpeed, checkGear);
        int checkNewSpeed = newBike.getSpeed();
        assertEquals(9, checkNewSpeed);
    }

    @Test
    public void decOnGearTwo() {
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(20, 1);
        int currentSpeed = newBike.getSpeed();
        newBike.deccelerate(currentSpeed, 1);
        int checkSpeed = newBike.getSpeed();
        newBike.changeGear(checkSpeed);
        int checkGear = newBike.getGear();
        assertEquals(1,checkGear);
        newBike.deccelerate(checkSpeed, checkGear);
    }
    @Test
    public void decOnGearThree() {
        Bike newBike = new Bike();
        newBike.switchBike("ON");
        newBike.accelerate(28, 3);
        int currentSpeed = newBike.getSpeed();
        newBike.deccelerate(currentSpeed, 3);
        int checkSpeed = newBike.getSpeed();
        newBike.changeGear(checkSpeed);
        int checkGear = newBike.getGear();
        assertEquals(2, checkGear);

    }
    @Test
    public void decOnGearFour() {
        Bike newBike = new Bike();
        newBike.switchBike("ON");

        newBike.accelerate(43, 1);
        int currentSpeed = newBike.getSpeed();
        newBike.deccelerate(currentSpeed, 4);
        int checkSpeed = newBike.getSpeed();
        newBike.changeGear(checkSpeed);
        int checkGear = newBike.getGear();
        assertEquals(3, checkGear);

    }

}
