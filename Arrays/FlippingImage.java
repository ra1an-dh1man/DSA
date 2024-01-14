/* 
    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*/
import java.util.Scanner;

public class FlippingImage 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r =scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                arr[i][j] =scn.nextInt();
            }

        }
        scn.close();

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = arr.length - 1 ; j>= 0 ; j--)
            {
                if(arr[i][j] == 1)
                    arr[i][j] = 0 ;
                else
                    arr[i][j] = 1;

                System.out.print(arr[i][j] + " ");
            }
        }
    }    
}
