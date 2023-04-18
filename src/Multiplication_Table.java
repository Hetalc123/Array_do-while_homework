import java.util.Scanner;
//print multiplication table of input number
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to print Table ");
        int a = sc.nextInt();
        int i=1;
        System.out.println("Multiplication Table of "+ a + " :");
        //loop to print table
        do {
            System.out.println(a+" X "+i+" = "+a*i);
            i++;
        }while (i<=12);

    }
}
