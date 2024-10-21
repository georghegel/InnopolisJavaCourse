import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        double average = calculateAverage(numbers);
        System.out.println("The average value of the array elements is: " + average);
        scanner.close();
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}