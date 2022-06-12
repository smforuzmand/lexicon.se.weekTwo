package exercise;

import java.util.Arrays;

public class ExerciseEight {
    private static int DuplicateNumber(int array[], int number) {
        int j = 0;
        for (int i = 0; i < number - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[number - 1];
        return j;
    }

    public static void run() {
        int array[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Arrays.sort(array);
        int length = array.length;
        length = DuplicateNumber(array, length);
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
    }
}
