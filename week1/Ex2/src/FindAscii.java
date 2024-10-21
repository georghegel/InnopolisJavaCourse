import java.util.Scanner;

public class FindAscii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Gimme the char:");
        char c = input.next().charAt(0);
        System.out.println("ASCII for the given char: " + int(c));
        input.close();
    }
}