package Module2;

import java.util.Scanner;

public class ComputeValue
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        int nn = n * 11;
        int nnn = n * 111;
        int result = n + nn + nnn;
        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
    }
}

