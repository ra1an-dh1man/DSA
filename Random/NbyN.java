/*
  Java program to create a random n X n matrix having random elements.
*/
import java.util.Scanner;

public class NbyN
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        Solution(n);

    }

    static void Solution(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print((int)(Math.random()  * 2) + " ");
            }
            System.out.println();
        }
    }
}
