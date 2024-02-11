/*
    Sample Input and Output:
    Enter the two numbers
    3
    4
    The two values after swapping are
    4
    3
*/

import java.util.Scanner;

public class SwapXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("The two values after swapping are");
        System.out.println(num1);
        System.out.println(num2);
    }
}
