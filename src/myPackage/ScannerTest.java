package myPackage;

import java.util.Scanner;

public class ScannerTest {

    public static void scannerTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = scanner.next().charAt(); // takes the character at index 0 from the string. "abc"->a;
        System.out.println("Value = " + c);

    }
}
