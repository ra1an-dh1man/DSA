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
        int min = arr[0];

        for(int i = 0 ; i < n  ;i++)
        {
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println(max - min);

    }

}
