package Chapter7Exercises;

import java.util.Arrays;

public class SieveOfEratoSthenes {
    private boolean[] arrays = new boolean[100];

    public void setEveryElementInArraytoTrue() {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = true;
        }
    }

    public String displayArray(){
       return Arrays.toString(arrays);

        }

    public void setMultipleOfTrueElementsToFalse() {
        for (int i = 2; i < arrays.length; i++) {
            if (arrays[i] == true) setMultiplesToFalse(i);
        }
    }
    public void setMultiplesToFalse(int index){
        for (int i=index+1; i < arrays.length; i++) {
            if(i % index==0) arrays[i] = false;
        }
    }

    public boolean[] getArrays() {
        return arrays;
    }

    public int returnNumberOfPrimeInArray(){
        int count = 0;
        for (int i = 2; i < arrays.length ; i++) {
            if (arrays[i]==true)count++;

        }
        return count;
    }


}




