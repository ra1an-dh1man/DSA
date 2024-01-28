/*
    Print the average of top three element of the 4 sized array.
*/
import java.util.Scanner;

public class Average 
{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int[] arr = new int[4];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        scn.close();

        int sum = 0;
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum = sum + arr[i];
        }

        double average = (double)(sum - min) / 4;

        System.out.println(average);
    }
}
