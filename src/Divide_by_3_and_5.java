//programme to divide numbers by 3 & 5
public class Divide_by_3_and_5 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        System.out.println("Numbers Divided by 3 Are :");
        //loop to divide numbers by 3
        while (i < 100) {
            if (i % 3 == 0) {
                System.out.print("," + i);
            }
            i++;
        }
        System.out.println();
        System.out.println("**** **** *** ***** ***");
        System.out.println("Numbers Divided by 5 Are :");
        //loops to divide numbers by 5
        while (j < 100) {
            if (j % 5 == 0) {
                System.out.print("," + j);
            }
            j++;
        }
    }
}

