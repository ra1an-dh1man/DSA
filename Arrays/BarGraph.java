import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        scn.close();

        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }

        for(int i = max ; i > 0 ; i--)
        {
            for(int j = 0 ; j <arr.length; j++)
            {
                if(arr[j] >= i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }

}
