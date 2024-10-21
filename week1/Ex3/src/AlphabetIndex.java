import java.util.Scanner;

public class AlphabetIndex {
    public static void main(String[] args) {
        System.out.println("Index of uppercase letters:");
        for (char c = 'A'; c <= 'Z'; ++c) {
            int index = c - 'A' + 1;
            System.out.println(c + ": " + index);
        }
        System.out.println("\nIndex of lowercase letters:");
        for (char c = 'a'; c <= 'z'; ++c) {
            int index = c - 'a' + 1; // Calculate index (1 to 26)
            System.out.println(c + ": " + index);
        }
    }
}