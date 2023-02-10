package task8_2;

import java.util.Scanner;

public class add_div_sub_mul
{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    devide = (float) first / second;

    System.out.println("add = " + add);
    System.out.println("sub = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
  }
}


