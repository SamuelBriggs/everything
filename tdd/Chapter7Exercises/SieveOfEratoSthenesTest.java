package Chapter7Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class SieveOfEratoSthenesTest {

     private SieveOfEratoSthenes prime;

    @BeforeEach

    public void setUp(){
        prime = new SieveOfEratoSthenes();
        prime.setEveryElementInArraytoTrue();
    }

    @Test

    public void checkIfallElementsAreSettoTrue(){
        SieveOfEratoSthenes prime = new SieveOfEratoSthenes();
        prime.setEveryElementInArraytoTrue();
        System.out.println(prime.displayArray());
    }

    @Test

    public void checkIfEveryIndexOfTrueElementsCanBeSetToFalse(){
        prime.setMultipleOfTrueElementsToFalse();
        System.out.println(prime.displayArray());
        System.out.println(prime.returnNumberOfPrimeInArray());
        assertTrue(true, String.valueOf(prime.getArrays()[6]));



    }



}