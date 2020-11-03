package program;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path");
        File path = new File(scanner.nextLine());
        File []folders = path.listFiles(File::isDirectory);
        File []files = path.listFiles(File::isFile);

        System.out.println("FILES");
        for (File obj: files) {
            System.out.println(obj);
        }

        System.out.println("FOLDERS");
        for (File obj:files) {
            System.out.println(obj);
        }


        scanner.close();
    }
}
