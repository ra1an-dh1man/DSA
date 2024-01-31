/*
    Program to print the number of times two present in a given number.
*/
import java.util.Scanner;

public class CountDigit 
{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        System.out.println(CountTwo(n));
        
    }

    static int CountTwo(int n){
    
    int count = 0;

    while(n != 0)
    {
        int num = n % 10;

        if(num == 2)
            count++;

        n = n / 10;
            
    }
    
    return count;

    }
    
}
