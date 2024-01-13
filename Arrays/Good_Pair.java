/*
    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

 */

import java.util.Scanner;

public class FoodPairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        scn.close();

        int count = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i + 1 ; j < arr.length ; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
        }

        System.out.println(count);
    }
    
}
