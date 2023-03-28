package Module2;

import java.util.Scanner;

public class CountDigits 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than ten billion: ");
        long num = input.nextLong();
        int count = 0;
        
        while (num != 0)
        {
            num /= 10;
            count++;
        }
        
        System.out.println("Number of digits in the number: " + count);
    }
}
