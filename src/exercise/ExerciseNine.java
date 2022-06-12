package exercise;

import java.util.Arrays;

public class ExerciseNine {
    public static String run() {
        String[] array1 = new String[5];
        String[] array2 = Arrays.copyOf(array1, array1.length + 5);
        System.out.println(Arrays.toString(array2));
        return null;
    }
}
