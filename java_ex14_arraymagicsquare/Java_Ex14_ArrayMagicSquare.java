/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #14
 * Write a program that reads a two-dimensional array of integers and 
 * determines whether it is a magic square (that is, whether the sum 
 * of all rows, all columns, and the diagonals is the same). 
 * Accept lines of input that you break up into individual integers, 
 * and stop when the user enters a blank line. For example, with the input
 * 16 3 2 13 
 * 5 10 11 8 
 * 9 6 7 12 
 * 4 15 14 1 
 * (Blank line) 
 * your program should respond affirmatively.
 */
package java_ex14_arraymagicsquare;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Java_Ex14_ArrayMagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read array
        Scanner scan = new Scanner(System.in);
        String inputArray = scan.nextLine();
        
        // Calculate rows and columns
        String[] columns;
        String[] rows;
        columns = inputArray.split("\t");
        //rows = inputArray.split("\n");
        int lengthCol = columns.length;
        
        String[][] squareArray = new String[lengthCol][lengthCol];
        
        for(int i=0; i<lengthCol;i++){
            for(int j=0; j<lengthCol;j++){
                squareArray[i][j] = columns[j];
            }
            if (i!=lengthCol-1){
                inputArray = scan.nextLine();
                columns = inputArray.split("\t");
                //System.out.println(inputArray);
            }
        }   
        
        // Sum of columns
        int[] sumCols = new int[lengthCol];
        for(int i1=0; i1<lengthCol;i1++){
            for(int j=0; j<lengthCol;j++){
                sumCols[i1] += Integer.parseInt(squareArray[i1][j]);
            }
        }
        System.out.println(Arrays.toString(sumCols));
        
        // Sum of columns
        int[] sumRows = new int[lengthCol];
        for(int i1=0; i1<lengthCol;i1++){
            for(int j=0; j<lengthCol;j++){
                sumRows[i1] += Integer.parseInt(squareArray[j][i1]);
            }
        }
        System.out.println(Arrays.toString(sumRows));

    }
    
}
//Input
//16	3	2	13
//5	10	11	8
//9	6	7	12
//4	15	14	1
