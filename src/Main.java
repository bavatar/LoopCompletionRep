// The following program should allow the users to input 10 integers and output the total.
// Please finish it.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        // Loop should start here
        for (int i=0; i<10; i++) {
            System.out.println("Input an Integer");
            num = keyboard.nextInt();
            total += num;
        }

        System.out.println("The total of all 10 numbers is " + total);
    }
}
