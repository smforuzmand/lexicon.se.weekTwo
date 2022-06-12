package exercise;

public class ExerciseSeven {
    public static int run(){
        int[] numbers = new int[]{1 ,2 ,4 ,7 ,9 ,12};
        for(int i = 0; i< numbers.length ; i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i] +" "+"is even");
            }
        }
        return 0;
    }
}
