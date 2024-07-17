/* rotating an array from a specific index

    input:2, 3, 4, 5, 6
          2

    output:4, 5, 6, 2, 3
*/



import java.util.Arrays;

public class Main
{
    public static void main(String[] args) 
    {
        int[] arr = {2, 3, 4, 5, 6};
        int x = 2;

        leftRotate(arr, x);
        System.out.println(Arrays.toString(arr));

    }

    //reversing the sun part of the array and then reversing the complete array
    private static void leftRotate(int arr[], int rt){
        rev(arr, 0, rt - 1);
        rev(arr, rt, arr.length - 1);
        rev(arr, 0, arr.length - 1);

    }

    //reversing the array 

    private static void rev(int[] arr, int i, int j){
        
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }


}
