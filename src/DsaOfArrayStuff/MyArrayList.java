package DsaOfArrayStuff;

import java.util.Arrays;

public class MyArrayList implements List {



    private int [] list = new int [0];


    private int size = 0;


    @Override
    public boolean isEmpty() {
        return (list.length == 0);

    }
    public void setList(){

    }

    @Override
    public void add(int element) {
        createNewList();
        list[list.length-1] = element;
    }
    public void createNewList(){

            int [] tempList = Arrays.copyOf(list,list.length+1 );
            list = Arrays.copyOf(tempList, list.length+1);
    }
    @Override
    public void remove(int element) {
         if (list.length == 0) throw new IllegalArgumentException("List is Empty.");
         int [] tempList = new int[list.length];
        for (int i = 0; i < tempList.length ; i++) {
            if (list[i] != element)  tempList[i] = list[i];}

            list = Arrays.copyOf(tempList, tempList.length);

        for (int i = 0; i < tempList.length; i++) {
            System.out.println(tempList[i]);
        }

        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]);
        }
    }

    @Override
    public int size() {

        return list.length;
    }

    @Override
    public int get(int index) {

        return list[index];
    }

    @Override
    public void getIndexOf(int index) {



    }

    @Override
    public void getCapacity() {

    }

    @Override
    public void add(int element, int index) {
        createNewList();
        int [] listOfElementsAfterIndex = new int[list.length - index];
        int [] listOfElementsBeforeIndex = new int[index];
        int firstCount = 0;
        for (int i = index; i < list.length; i++) {
            listOfElementsAfterIndex[firstCount] = list[i];
            firstCount++;
        }
        int secondCount = 0;
        for (int i = 0; i < index; i++) {
            listOfElementsBeforeIndex[secondCount] = list[i];
            secondCount++;
        }
        list[index] = element;
            int anotherCount = 0;
        for (int i = index+1; i < listOfElementsAfterIndex.length; i++) {
            list[i] = listOfElementsAfterIndex[anotherCount];
            anotherCount++;
        }

        for (int i = 0; i < listOfElementsBeforeIndex.length; i++) {
            list[i] = listOfElementsBeforeIndex[i];
        }
        
        }




}



