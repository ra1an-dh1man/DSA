/*
    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[1,4,7],[2,5,8],[3,6,9]]
 */
import java.util.Scanner;

public class TransposeMatrix 
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

        int[][] transpose = new int[r][c];

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
