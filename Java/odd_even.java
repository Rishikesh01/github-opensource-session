import java.util.Scanner;

public class odd_even {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
        in.close();
    }
}