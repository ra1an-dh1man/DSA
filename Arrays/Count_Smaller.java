/*
    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
    Explanation: 
    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
    For nums[1]=1 does not exist any smaller number than it.
    For nums[2]=2 there exist one smaller number than it (1). 
    For nums[3]=2 there exist one smaller number than it (1). 
    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */
import java.util.Scanner;

public class SmallerCount 
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
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            int count = 0;

            for(int j = 0 ; j < arr.length ; j++)
            {
                if(arr[i] > arr[j])
                    count++;
            }
            System.out.println(count + " ");

        }
    }
    
}
