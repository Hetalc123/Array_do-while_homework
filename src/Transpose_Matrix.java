import java.util.Arrays;
import java.util.Scanner;
//create transpose matrix
public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row to be stored in array");
        int row = sc.nextInt();
        System.out.println("Enter number of column to be stored:");
        int column = sc.nextInt();
        int a[][] = new int[row][column];
        //initialise rows and columns
        System.out.println("Enter the Elements of matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        ;//print matrix of input rows and columns
        System.out.println("Matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            //transpose the matrix and print
        }
        System.out.println("After transposing the matrix :");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
