import java.util.Scanner;

public class Factors 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for(int i = 1 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0)
                {
                    int res = n / i;
                    if(i != res)
                        System.out.println(i +" " + res );
                    else
                        System.out.println(i);
                    
                }
        }
    }    
}
