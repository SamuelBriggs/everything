

import DsaOfArrayStuff.List;
import DsaOfArrayStuff.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTests {

    MyArrayList myArrayList;

    @BeforeEach
    public void startEachTestWith() {
        myArrayList = new MyArrayList();
    }

    @Test
    public void arrayListCanBeCreatedTest() {
        assertNotNull(myArrayList);
    }

    @Test
    public void newArrayListIsEmptyTest() {
        assertTrue(myArrayList.isEmpty());
    }


    @Test
    public void addElement_ArrayListShouldNotBeEmptyTest() {
        //when
        myArrayList.add(34);
        //assert
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void addXRemoveX_ArrayListShouldBeEmpty() {
        //when
        myArrayList.add(34);
        myArrayList.remove(34);
        //assert
        assertTrue(myArrayList.isEmpty());

    }

    @Test
    public void addXAndY_removeY_arrayShouldNotBeEmpty() {
        //when
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        myArrayList.add(90);



        myArrayList.remove(90);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void removeFromEmptyArrayList_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> myArrayList.remove(34));
    }

    @Test
    public void addOneElement_arrayListSizeIsOne() {
        myArrayList.add(34);
        assertEquals(1, myArrayList.size());
    }

    @Test
    public void addElement_arrayListSizeIncreases() {
        myArrayList.add(34);
        myArrayList.add(34);
        assertEquals(2, myArrayList.size());
    }


    @Test
    public void insertElementInArrayList() {
        myArrayList.add(34);
        myArrayList.add(94, 0);
        assertEquals(34, myArrayList.get(1));
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void addThreeElement_getSecondByIndex() {
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
        assertEquals(32, myArrayList.get(1));
    }

    @Test
    public void addXYZ_removeY_ZShouldBeInPositionOfY() {
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);

        myArrayList.remove(32);
        assertEquals(99, myArrayList.get(1));
        assertEquals(2, myArrayList.size());
        assertEquals(0, myArrayList.get(2));
    }

}