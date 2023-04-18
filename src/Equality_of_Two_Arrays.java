import java.util.Arrays;
import java.util.Scanner;

//Check equality of two arrays
public class Equality_of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements needs to be stored in Array 1:");
        int num = sc.nextInt();
        //take input for the number of elements needs to store in array1
        int[] a = new int[num];
        System.out.println("Enter Elements of Array1: ");
        //loop to execute to read the elements entered by user
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array 1 is :");
        System.out.print(Arrays.toString(a));
        System.out.println("\nEnter Number of Elements needs to be stored in Array2: ");
        int num2 = sc.nextInt();
        int[] b = new int[num2];
        System.out.println("Enter Elements of Array2: ");
        for (int i = 0; i < num2; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Array 2 is:");
        System.out.println(Arrays.toString(b));
        //compare two arrays to check equality
        if (Arrays.equals(a, b)) {
            System.out.println("Array1 and Array2 are Equal");
        } else {
            System.out.println("Array1 and Array2 are Not Equal");
        }
    }
}

