import java.util.Scanner;

public class SumRecur 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        
        System.out.println(getSum(n));
    }    

    static int getSum(int n)
    {
        if(n == 0)
            return 0;
        else    
            return n + getSum(n - 1);
    }
}
