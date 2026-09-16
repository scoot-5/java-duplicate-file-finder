import java.util.Scanner;
import java.io.File;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Duplicate file finder");
    System.out.print("Enter a folder path: ");
    String folderPath = scanner.nextLine();
    System.out.println("The folder you entered: " + folderPath);
    File file = new File(folderPath);
    if (file.exists() && file.isDirectory())
        System.out.println("this folder exists");
    else System.out.println("invalid path try again");




}