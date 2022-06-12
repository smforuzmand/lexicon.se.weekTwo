package exercise;

public class ExerciseTen {
    public static void run() {
        int[][] MultiTable = new int[10][10];
        int row = 1 , column=1;

        for(int i=0 ; i<MultiTable.length; i++){
            for(int j=0 ; j<MultiTable[i].length; j++){
                MultiTable[i][j] = row * column;
                column = column+1;
            }
            row = row+1;
            column = 1;
        }
        for (int i = 0 ; i< MultiTable.length; i++){
            for(int j=0 ; j< MultiTable[i].length; j++){
                System.out.println(MultiTable[i][j]+"\t| " + "\n");
            }

        }

    }
}
