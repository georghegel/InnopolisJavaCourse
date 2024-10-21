import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class InsertAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("List size: ");
        int size = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        System.out.print("Enter the element: ");
        int element = scanner.nextInt();

        System.out.print("Enter the position to insert: ");
        int position = scanner.nextInt();

        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position");
        } else {
            list.add(position, element);
            System.out.println("List after insertion:");
            for (int num : list) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}