import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ExampleClass {
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        System.out.println("Enter something good (no numbers... or else): ");
        String input = scanned.nextLine();
        // checking for numeric inputs
        if (!StringUtils.isAlpha(input)) {
            System.out.printf("%s: I see some numbers there goofball.\n", input);
        } else {
            System.out.printf("%s: has no numbers! Good!\n", input);
        }

        // flips the case of string
        System.out.println("Flipped case: " + StringUtils.swapCase(input));

        // reverses the string
        System.out.println("Reversed: " + StringUtils.reverse(input));
    }
}
