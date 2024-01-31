/*
    Java program to print the twin prime number less than 100.
    (Twin prime numbers are the prime number which have difference of two between them)
 */
public class TwinPrime 
{
    public static void main(String[] args) {

        for(int i = 0 ; i < 100 ; i++)
        {
            if(Twin(i) && Twin(i + 2))
                System.out.printf("(%d, %d)\n", i, i + 2);
        }
        
    }   
    
    static boolean Twin(long n)
    {
        if(n < 2)
            return false;

        for(int i = 2 ; i < n / 2 ; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
