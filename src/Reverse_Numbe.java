import java.util.Scanner;

//programme to reverse the number
public class Reverse_Numbe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to be reversed :");
        int a = sc.nextInt();
        int r = 0;
        int i = a;
        //get the last number in form of remeinder and add each number
        // using loop to get reversed number
        while (i != 0) {
            int b = i % 10;
            r = r * 10 + b;
            i = i / 10;
        }
        System.out.println("Reversed Number of " + a + " is:");
        System.out.println(r);
    }
}
