package arrays;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        // declare 2D array:
        int [][] matrix;
        matrix  = new int[3][4];
        Scanner input = new Scanner(System.in);
        
        //read the matrix values from keboard:
        System.out.println("pleas enter 4 rows and 3cols:");
        for(int row = 0; row < 4; row++){
            for(int col = 0; col  < 3; col++) {
                matrix[col][row] = input.nextInt();
            }//end of for, col
        }//end of for, row
        
        //display the matrix values on screen:
        for(int row = 0; row < 4; row++){
            for(int col = 0; col  < 3; col++) {
//                System.out.print(matrix[col][row] + " ");
                System.out.printf( "%4d ", matrix[col][row]);
            }//end of for, col
            System.out.println();
        }//end of for, row
        
        System.out.print(getSum(matrix));
    } //end of main
    
    public static int getSum(int[][] table){
        int result = 0;
        for(int row = 0; row < table.length; row++){
            for(int col = 0; col < table[0].length; col++) {
                result += table[row][col];
            }//end of for, col
        }//end of for, row
        return result;
    }//end of getSum
    
}//end of class arrays