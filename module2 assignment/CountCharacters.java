package Module2;

import java.util.Scanner;

public class CountCharacters 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (Character.isLetter(ch))
            {
                letters++;
            }
            else if (Character.isDigit(ch)) 
            {
                numbers++;
            }
            else if (Character.isSpaceChar(ch)) 
            {
                spaces++;
            } else 
            {
                others++;
            }
        }

        System.out.println("Number of letters: " + letters);
        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Number of other characters: " + others);
    }
}

