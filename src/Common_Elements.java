import java.util.Arrays;
import java.util.Scanner;

//find common elements of two strings
public class Common_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String name1 = sc.nextLine();
        //seperate each character
        String[] n1 = name1.split("");
        System.out.println(Arrays.toString(n1));
        System.out.println("Enter String 2");
        String name2 = sc.nextLine();
        String[] n2 = name2.split("");
        System.out.println(Arrays.toString(n2));
        System.out.println("Common elements between " + name1 + " & " + name2 + " : ");
        //run a loop to compare characters of both string
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n2.length; j++) {
                if (n1[i].equals(n2[j])) {
                    System.out.print(n1[i] + ",");
                }

            }

        }
    }
}





