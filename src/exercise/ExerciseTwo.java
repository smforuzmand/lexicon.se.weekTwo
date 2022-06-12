package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseTwo {
    private static int indexOf(int[] array, int element) {

            int indexFound = Arrays.binarySearch(array, element);
            int indexNotFound = -1;
            if(indexFound<0){
                return indexNotFound;
            }else{
                return indexFound;
            }

    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter new digit : ");
        int element = sc.nextInt();
        int[] numbers ={1,2,3,4,5,6,7,8,100,20};
        int index = indexOf(numbers,element);
        System.out.println("the index is " + index);
    }

}
