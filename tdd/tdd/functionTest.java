package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class functionTest {
    @Test
    public void unitPriceOfCopiesBetween1And4() {
        UnitPrice unitPrice = new UnitPrice();
        int price = unitPrice.priceOf(4);
        assertEquals(4, price);
    }

    @Test
    public void unitPriceOfCopiesBetween5And9() {
        UnitPrice unitPrice = new UnitPrice();
        int price = unitPrice.priceOf(6);
        assertEquals(10800, price);

    }

    @Test
    public void unitPriceOfCopiesBetween10And29() {
        UnitPrice unitPrice = new UnitPrice();
        int price = unitPrice.priceOf(12);
        assertEquals(19200, price);
    }

    @Test
    public void unitPriceOfCopiesBetween30And49() {
        UnitPrice unitPrice = new UnitPrice();
        int price = unitPrice.priceOf(35);
        assertEquals(52500, price);
    }

    @Test
    public void unitPriceOfCopiesBetween50And99() {
        UnitPrice unitPrice = new UnitPrice();
        int price = unitPrice.priceOf(55);
        assertEquals(71500, price);
    }

    @Test
    public void unitPriceOfCopiesBetween100And199() {
        UnitPrice unitPrice = new UnitPrice();
        int price = unitPrice.priceOf(120);
        assertEquals(144000, price);
    }

    @Test
    public void unitPriceOfCopiesBetween200And499() {
        UnitPrice unitPrice = new UnitPrice();
        int price = unitPrice.priceOf(209);
        assertEquals(229900, price);
    }

    @Test
    public void unitPriceOfCopiesAbove500() {
        UnitPrice unitPrice = new UnitPrice();
        int price = unitPrice.priceOf(500);
        assertEquals(500000, price);
    }
}
