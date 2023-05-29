package homework;

import java.util.Scanner;

/**3. Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 error message.
 For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant
 */

public class VowelOrConsonant3 {

            public static void voc(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input an alphabet: ");
            String input = scanner.nextLine();
            scanner.close();

            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                char ch = input.toLowerCase().charAt(0);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            } else {
                System.out.println("Error: Please enter a single letter.");
            }
            scanner.close();
        }

    public static void main(String[] args) {
        voc();
    }

    }



