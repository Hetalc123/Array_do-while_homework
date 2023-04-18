import java.util.Arrays;
import java.util.Scanner;

//Programme to sort input value in ascending order
public class Sort_The_Array_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements to be stored in an Array");
        int a = sc.nextInt();
        //takes the number of input to be stored in an array
        int[] b = new int[a];
        System.out.println("Enter the value needs to be Sorted:");
        //loops to take input value
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Values needs to be sorted in ascending order");
        System.out.println(Arrays.toString(b));
        //code to be executed to sort the input value in ascending order
        System.out.println("Values after sorted in Ascending order as: ");
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
        }
        System.out.println(Arrays.toString(b));
    }
}
