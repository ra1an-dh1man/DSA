/*
    Example 1:

    Input: gain = [-5,1,5,0,-7]
    Output:   0 -5 -4 1 1 -6
              1
    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
    
 */

import java.util.Scanner;

public class HighestAltitude 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] arr2 = new int[n+1];

        for(int i = 0 ; i < arr2.length ; i++)
        {
            if(i == 0)
                arr2[i] = 0;
            else
                arr2[i] = arr2[i - 1] + arr[i - 1];
            System.out.print(arr2[i] + " "); 
        }

        System.out.println();
        int max = arr2[0];
        for(int i = 0 ; i < arr2.length ; i++)
        {
            if(max < arr2[i])
                max = arr2[i];       
        }
        System.out.println(max);
    }
}
