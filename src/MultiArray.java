import java.util.Arrays;

public class MultiArray {
    public static void main (String [] args) {


        String [][] myArray = new String [10] [5];
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(" row " + i);
                System.out.print(" col " + j + "   ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");


        int [] [] newArray = new int [12] [12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {

                newArray [i][j] = ((i + 1) * (j + 1));
            }
        }


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.printf("%-6d", newArray[i][j]);
            }
            System.out.println(" ");
        }
    }
}
