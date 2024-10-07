package rs.raf;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to validate against token patterns:");
        String input = scanner.nextLine();
        validateInput(input, Patterns.BINARY_STRING);

        scanner.close();
    }

    private static void validateInput(String input, PatternType patternType) {
        Pattern pattern = Pattern.compile(patternType.regex());
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("The input matches the pattern: " + patternType.name());
        } else {
            System.out.println("The input does NOT match the pattern: " + patternType.name());
        }
    }
}