package exercise;

import java.util.Arrays;

public class ExerciseFive {
    public static String[][] twoDString(String[][] CountryCity) {
        return CountryCity;
    }

    public static void run() {
    String[][] CountryCity = new String[2][2];
    CountryCity[0][0] = "Iran";
    CountryCity[0][1] = "Tehran";
    CountryCity[1][0]= "Sweden";
    CountryCity[1][1]="Stockholm";
    //for (int i=0; i<CountryCity.length;i++){
        //for (int j=0 ; j<CountryCity.length;j++){
            System.out.println(Arrays.deepToString(CountryCity));
        }
    }


