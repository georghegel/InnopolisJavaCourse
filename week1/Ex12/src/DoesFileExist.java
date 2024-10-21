import java.io.File;
import java.util.Scanner;

public class DoesFileExist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme the path: ");
        String pathname = scanner.nextLine();

        File file = new File(pathname);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It's a file.");
            } else if (file.isDirectory()) {
                System.out.println("It's a directory.");
            }
        } else {
            System.out.println("Nothing!");
        }

        scanner.close();
    }
}
