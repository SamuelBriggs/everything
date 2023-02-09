package tdd;

import chapter3Exercises.PetrolPurchase.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {

    @Test

        public void testToCheckIfClassExists(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("lagos", "lead", 50, 20, 10)
                ;
        assertNotNull(petrolPurchase);}

    @Test

        public void checkLocationTest(){

            PetrolPurchase petrolPurchase = new PetrolPurchase("lagos", "lead", 50, 20, 10)
                    ;
            assertEquals("lagos", petrolPurchase.getStationLocation());}

    @Test
        public void percentDiscountTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("lagos", "lead", 50, 20, 10)
                    ;
        assertEquals(900, petrolPurchase.getPurchaseAmount());}

    @Test public void checkIfPriceIsSetTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("lagos", "lead", 50, 20, 10)
                ;

        petrolPurchase.setPricePerLitre(120);

        assertEquals(120, petrolPurchase.getPricePerLitre());

        }
    @Test

    public void checkNewPurchaseAmountAfterNewPricePerLitreIsSet(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("lagos", "lead", 50, 20, 10)
                ;
        petrolPurchase.setPricePerLitre(100);
        assertEquals(4500, petrolPurchase.getPurchaseAmount());


    }





}








