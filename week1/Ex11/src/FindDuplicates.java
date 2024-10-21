import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        findDuplicates(array);

        scanner.close();
    }

    public static void findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>(); // store values that we've seen
        HashSet<Integer> dups = new HashSet<>(); // if we duplicated - then we have a dup

        for (int value : array) {
            if (!seen.add(value)) {
                dups.add(value);
            }
        }

        if (dups.isEmpty()) {
            System.out.println("No duplicates.");
        } else {
            System.out.println("Duplicates:");
            for (int duplicate : dups) {
                System.out.print(duplicate + " ");
            }
        }
    }
}