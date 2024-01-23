import java.util.Scanner;

public class LineatSearchINT 
{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        
        int target = scn.nextInt();
        scn.close();

        System.out.println(LinearSearch(arr, target));
    }   

    public static int LinearSearch(int[] arr, int target)
    {   if(arr.length == 0)
            return 0;
        
        for(int i = 0 ; i< arr.length ; i++)
        { 
            if(arr[i] == target)
                return i;
        }

        return -1;
    }
}
