import java.util.Scanner;

//programme to check if input number is Armstrong number
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int count = 0;
        int r;
        int total = 1;
        int sum = 0;
        //code to find number of digit in input number
        for (int j = a; j != 0; j = j / 10) {
            ++count;
        }
        System.out.println("Total Number of Digits are => " + count);
        //code to get each digit in form of remeinder and than get the power of given number
        for (int j = a; j != 0; j = j / 10) {
            r = j % 10;
            total = (int) Math.pow(r, count);
            System.out.println(r + " to the Power " + count + " is " + total);
            sum = sum + total;
        }
        System.out.println("Total is => " + sum);
        //compare given number with sum of each digit's raised to the power to check if number is armstrong number
        if (sum == a) {
            System.out.println(a + " is Armstrong Number ");
        } else {
            System.out.println(a + " is not Armstrong Number");
        }
    }

}





