package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExerciseFour {
    private static int[] copyOf(int[] array) {
        Arrays.copyOf(array,array.length);
        return array;
    }
    public static void run(){
        int[] FirstArray = { 1,15,20};
        int[] SecondArray = copyOf(FirstArray);
        for (int number : SecondArray){
            System.out.println(number);
        }
    }

}
