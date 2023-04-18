import java.util.Arrays;
import java.util.Scanner;

//code to remove specific element
public class Remove_eliments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements needs to be stored:");
        int a = sc.nextInt();
        int[] b = new int[a];
        System.out.println("Enter Value in index:");
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Int Array is as :");
        System.out.println(Arrays.toString(b));
        System.out.println("Enter element needs to be removed");
        int e = sc.nextInt();
        for (int i = 0; i < b.length; i++) {
            //code to find element and shift
            if (b[i] == e) {
                for (int j = i; j < b.length - 1; j++) {
                    b[j] = b[j + 1];
                }
            }//run loop to print array after deleting index
        }
        System.out.println("Array after removing index");
        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + " ");

        }
    }
}
