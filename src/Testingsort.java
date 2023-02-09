import java.util.Arrays;

public class Testingsort {


    public static void main(String[] args) {
        int[] arr = {5,6,4,3,2,2};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(returnSorted(arr)));
    }
    public static int [] returnSorted(int [] arr){
        int [] newArray = new int[6];
        Arrays.sort(arr);
        newArray = arr;
        return newArray;
    }



}
