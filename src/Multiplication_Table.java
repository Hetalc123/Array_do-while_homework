import java.util.Scanner;
//print multiplication table as given pattern
public class Multiplication_Table {
    public static void main(String[] args) {
        int i=0;
        //running loop to print pattern
        do {i++;
            for (int j = 1; j <= 3; j++) {
                System.out.print(i*j + " ");
            }System.out.println();
        }while (i<3);

    }
}
