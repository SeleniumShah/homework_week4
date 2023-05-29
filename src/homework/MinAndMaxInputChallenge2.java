package homework;

import java.util.Scanner;

/**2. -Read the numbers from the console entered by the user and print the minimum
 and maximum number the user has entered.
 -Before the user enters the number, print the message Enter number:
 -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 number.
 Hint:
 -Use an endless while loop.
 -Create a class with the name MinAndMaxInputChallenge2.
 */

public class MinAndMaxInputChallenge2 {

    public static void number(){
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break;
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        scanner.close();
    }
    public static void main(String[] args) {
        number();

    }
}

