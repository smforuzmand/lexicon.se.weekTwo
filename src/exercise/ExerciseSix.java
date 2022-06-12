package exercise;

public class ExerciseSix {
    public static void run() {
        int[] numbers = {43, 5, 23, 17, 2, 14};
        int sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            average = sum / numbers.length;

        }
        System.out.println("the average of given numbers is :" + average);
    }
}
