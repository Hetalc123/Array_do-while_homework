import java.util.Arrays;
import java.util.Scanner;

//code to get common value of string
public class Common_String_value {
    public static void main(String[] args) {
        //take input for string value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of String value to be stored :");
        int a = sc.nextInt();
        System.out.println("Enter number of String value to be stored");
        int b = sc.nextInt();
        //assign string to array
        String[] name1 = new String[a];
        String[] name2 = new String[b];
        System.out.println("Enter Value for String1");
        for (int i = 0; i < a; i++) {
            name1[i] = sc.next();
        }
        System.out.println("Array 1 ::" + Arrays.toString(name1));
        System.out.println("Enter value for String2");
        for (int i = 0; i < b; i++) {
            name2[i] = sc.next();
        }
        //code to print common value
        System.out.println("Array 2 ::" + Arrays.toString(name2));
        System.out.println("Common Values between Array 1 and Array2 are:");
        for (int i = 0; i < name1.length; i++) {
            for (int j = 0; j < name2.length; j++) {
                if (name1[i].equals(name2[j])) {
                    System.out.println(name1[i]);
                }

            }

        }
    }
}
