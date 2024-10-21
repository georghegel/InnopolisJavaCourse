import java.io.File;
import java.util.Scanner;

public class IsDirOrFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gimme the path: ");
        String pathname = scanner.nextLine();

        File file = new File(pathname);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("FILE.");
            } else if (file.isDirectory()) {
                System.out.println("DIRECTORY.");
            }
        } else {
            System.out.println("DON'T MESS WITH US");
        }

        scanner.close();
    }
}
