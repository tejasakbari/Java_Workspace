package Module2;

import java.util.Scanner;

public class AsciiValue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is " + ascii);
    }
}
