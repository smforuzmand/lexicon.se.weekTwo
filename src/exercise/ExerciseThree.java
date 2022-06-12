package exercise;

import java.util.Arrays;
public class ExerciseThree {
    private static String[] sort(String[] cityName){
        Arrays.sort(cityName);
        return cityName;
    }
    public static void run(){
        String[] cityName = {"Paris", "London", "New York", "Stockholm"};
        String[] sortCities = sort(cityName);
        String sortedCitiesString = Arrays.toString(sortCities);
        System.out.println(sortedCitiesString);
        /*Arrays.sort(cityName, String.CASE_INSENSITIVE_ORDER);
        for (String name : cityName) {
            System.out.println(name);
        }*/

    }
}
