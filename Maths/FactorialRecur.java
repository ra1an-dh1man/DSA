import java.util.Scanner;

public class FactorialRecur
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        System.out.println(getFactorial(n));
    }

    static int getFactorial(int n)
    {
        if(n == 0)
            return 1;
        else if(n < 0)
            return -1;
        else
        {
            return n * getFactorial(n - 1);
        }
    }
}
