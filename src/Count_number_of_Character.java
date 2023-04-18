import java.util.Scanner;
//count total number of given character in input string
public class Count_number_of_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Name ");
        String name = sc.nextLine();
        System.out.println("Enter Character needs to be counted: ");
        char a = sc.next().charAt(0);
        int sum = 0;
        int i = 0;
        //run a loop to get the 'a' character and then print total of it
        while (i < name.length()) {
            if (name.charAt(i) == a) {
                sum = sum + 1;
            }
            i++;
        }
        System.out.println("Total number of " + a + " in Input String are => " + sum);
    }
}


