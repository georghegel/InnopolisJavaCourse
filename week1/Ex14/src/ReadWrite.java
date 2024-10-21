import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Source path: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Dest path: ");
        String destinationPath = scanner.nextLine();

        try (FileReader fileReader = new FileReader(sourcePath);
             FileWriter fileWriter = new FileWriter(destinationPath)) {

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("Data has been written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
