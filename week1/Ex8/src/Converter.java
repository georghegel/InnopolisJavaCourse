import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Decimal to Binary:" + Integer.toBinaryString(number));
        System.out.println("Decimal to Octal:" + Integer.toOctalString(number));
        System.out.println("Decimal to Hexadecimal:" + Integer.toHexString(number));
        System.out.println("Binary to Decimal:" + Integer.toBinaryString(number));
        System.out.println("Binary to Octal:" + Integer.toOctalString(number));
        System.out.println("Binary to Hexadecimal:" + Integer.toHexString(number));
        System.out.println("Octal to Decimal:" + Integer.toOctalString(number));
        System.out.println("Octal to Hexadecimal:" + Integer.toHexString(number));
        System.out.println("Octal to Binary:" + Integer.toBinaryString(number));
        System.out.println("Hexadecimal to Decimal:" + Integer.toHexString(number));
        System.out.println("Hexadecimal to Octal:" + Integer.toOctalString(number));
        System.out.println("Hexadecimal to Binary:" + Integer.toBinaryString(number));
        scanner.close();
    }
}